package cn.injava.dubboss.service.starter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 启动服务的提供者
 *
 * Created by apple on 16/2/18.
 */
public class StartService {
    public static void main(String[] args){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("dubboss-service.xml") ;
        ac.start();
        System.out.println("DemoService服务已经注册成功");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
