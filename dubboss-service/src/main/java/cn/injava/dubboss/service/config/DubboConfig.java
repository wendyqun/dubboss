package cn.injava.dubboss.service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({ "classpath:dubbo/dubboss-service.xml" })
public class DubboConfig {

}