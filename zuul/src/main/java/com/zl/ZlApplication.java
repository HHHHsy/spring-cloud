package com.zl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableAutoConfiguration
public class ZlApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZlApplication.class,args);
    }
}
