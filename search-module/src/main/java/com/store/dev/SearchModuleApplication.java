package com.store.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SearchModuleApplication {
    public static void main(String[] args) {
        SpringApplication.run(SearchModuleApplication.class, args);
    }
}
