package cn.injava.dubboss.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 启动服务的提供者
 *
 * Created by apple on 16/2/18.
 */
@SpringBootApplication
public class StartService {
    public static void main(String[] args){
        SpringApplication application=new SpringApplication(StartService.class);
        ConfigurableApplicationContext context=application.run(args);
    }
}
