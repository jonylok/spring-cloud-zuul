package com.neo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//@EnableZuulProxy
@SpringBootApplication
@EnableZuulProxy
public class ZuulServerApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ZuulServerApplication.class);
    }

    public static void main(String[] args) {
        //SpringApplication.run(EurekaServerApplication.class, args);
        new SpringApplicationBuilder(ZuulServerApplication.class).web(true).run(args);
    }
}