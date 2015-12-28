package org.yanlz.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by yanliangzhao on 15/12/28.
 */
@SpringBootApplication
public class application {
    public static void main(String[] args){
        SpringApplication springApplication = new SpringApplication(application.class);
        springApplication.run(args);
    }
}
