package com.floatingcity.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

@Configuration //配置类
public class DemoConfig {
    @Bean // 将第三方的bean化为己用
    public SimpleDateFormat simpleDateFormat() {
        return new SimpleDateFormat("yy-MM-dd HH:mm:ss");
    }
}
