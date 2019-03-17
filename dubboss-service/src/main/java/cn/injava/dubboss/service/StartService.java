package cn.injava.dubboss.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

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
