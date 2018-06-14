package com.damao.jpaquerydsldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class JpaQuerydslDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaQuerydslDemoApplication.class, args);
    }
}
