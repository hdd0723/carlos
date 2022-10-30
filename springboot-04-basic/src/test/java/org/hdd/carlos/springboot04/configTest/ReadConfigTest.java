package org.hdd.carlos.springboot04.configTest;

import org.hdd.carlos.springboot04.config.PersonConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ReadConfigTest {

    // 自动获取配置文件的age
    @Value("${age}")
    private int age;

    @Value("${name}")
    private String name;

    @Test
    public void printAge() {
        System.out.println("age: " + age);
    }

    @Test
    public void printName() {
        System.out.println("name: " + name);
    }

    /**
     * 注解注入的两种方式
     * 1. Configuration + Autowired
     * 2. Bean + Autowired
     */
    // 1. 注入自定义的Config类
    @Autowired
    private PersonConfig personConfig;
    @Test
    public void printPersonInfoWithConfigClass() {
        System.out.println(personConfig.getName() + " is " + personConfig.getAge() + " now.(Config class)");
    }

    // 2.1 将方法的返回值作为bean
    @Bean
    @ConfigurationProperties(prefix = "personinfo")
    public PersonConfig getPersonConfig() {
        return new PersonConfig();
    }

    // 2.2 将方法的返回值注入
    @Autowired
    private PersonConfig getPersonConfig;

    @Test
    public void printPersonInfoWithBeanConfig() {
        System.out.println(getPersonConfig.getName() + " is " + getPersonConfig.getAge() + " now.(Method bean)");
    }



}
