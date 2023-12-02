package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DemoApplication
{

    public static void main(String[] args)
    {
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);

    }

    @GetMapping("/hello")
    public String hello()
            throws InterruptedException
    {
        Thread.sleep(20000);
        return "hello world";
    }


}
