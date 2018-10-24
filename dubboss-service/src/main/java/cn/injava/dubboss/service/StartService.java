package cn.injava.dubboss.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动服务的提供者
 *
 * Created by apple on 16/2/18.
 */
@SpringBootApplication
public class StartService {
    public static void main(String[] args){
        //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        /*ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("dubbo/dubboss-service.xml") ;
        ac.start();
        System.out.println("DemoService服务已经注册成功");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        SpringApplication application=new SpringApplication(StartService.class);
        application.run(args);
    }
}
