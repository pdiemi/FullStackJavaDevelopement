package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan (basePackages="com")
@ImportResource(value="classpath:beans.xml")
public class AppConfig {

}
