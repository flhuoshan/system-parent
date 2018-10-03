package com.domain.system.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @author <a href="mailto:caolei@gznb.com">cl</a>
 * @version 1.0 & 2017/10/12
 * @since 1.0
 * To change this template use File | Settings | Editor | File and Code Templates
 * Description:
 */
@SpringBootApplication
@PropertySource(value = {"application.properties"})
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}