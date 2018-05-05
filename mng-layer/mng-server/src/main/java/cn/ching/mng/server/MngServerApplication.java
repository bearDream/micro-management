package cn.ching.mng.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: laxzhang
 * @email: laxzhang@outlook.com
 * @description: SpringBootApplication and Mandal Entrance
 **/
@SpringBootApplication
@ComponentScan(basePackages = {"cn.ching.mng"})
public class MngServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MngServerApplication.class, args);
    }
}
