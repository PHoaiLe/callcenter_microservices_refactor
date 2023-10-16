package com.callcenter;

import jdk.jfr.Enabled;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableAsync
public class CustomerInfoService
{
    public static void main(String[] args)
    {
        SpringApplication.run(CustomerInfoService.class, args);
    }
}