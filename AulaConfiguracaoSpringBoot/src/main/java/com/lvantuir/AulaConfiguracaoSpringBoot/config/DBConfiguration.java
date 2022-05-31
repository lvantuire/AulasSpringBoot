package com.lvantuir.AulaConfiguracaoSpringBoot.config;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;




@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration {
    private String driverClassName;
    private String url;
    private String username;
    private String password;


    @Profile("dev")
    @Bean
    public String testDatabaseConnection() {
        System.out.println("DB conection for DEV - H-2");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB conection to H2_TEST - Test instance";
    }

    @Profile("prod")
    @Bean
    public String productionDatabaseConnection() {
        System.out.println("DB conection for Production - MySQL");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB conection to MYSQL_PROD - Production instance";
    }
}
