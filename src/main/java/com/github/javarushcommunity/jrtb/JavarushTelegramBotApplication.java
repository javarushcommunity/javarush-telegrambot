package com.github.javarushcommunity.jrtb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class JavarushTelegramBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavarushTelegramBotApplication.class, args);
    }

}
