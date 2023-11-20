package com.rv.polling_app_server;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@EntityScan(basePackageClasses = {
        Polling_app_serverApplication.class,
        Jsr310JpaConverters.class
})
public class Polling_app_serverApplication {

    @PostConstruct
    void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }

    public static void main(String[] args) {
        SpringApplication.run(Polling_app_serverApplication.class, args);
    }

}
