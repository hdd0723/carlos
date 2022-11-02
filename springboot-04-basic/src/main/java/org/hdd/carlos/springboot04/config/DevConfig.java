package org.hdd.carlos.springboot04.config;

import lombok.Data;
import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "dev.config")
public class DevConfig {
    private String name;
    private int age;
    private List<String> address;
}
