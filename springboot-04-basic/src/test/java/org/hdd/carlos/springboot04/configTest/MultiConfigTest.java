package org.hdd.carlos.springboot04.configTest;

import org.hdd.carlos.springboot04.config.DevConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MultiConfigTest {

    // 注入properties注解
    @Autowired
    private DevConfig devConfig;

    @Test
    public void printDevConfig() {
        System.out.println(devConfig.getName());
        System.out.println(devConfig.getAge());
        System.out.println(devConfig.getAddress());
    }

    @Value("${config.prefix}")
    String nowConfig;

    @Test
    public void printNowUsingConfig() {
        System.out.println(nowConfig);
    }
}
