package cn.injava.dubboss.server.controller;

import cn.injava.dubboss.api.DemoService;
import cn.injava.dubboss.api.StubTestService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * springmvc的controller层
 *
 * Created by apple on 16/2/18.
 */
@RestController
public class DemoController{
    /*ApplicationContext context;*/
    @Reference(loadbalance = "roundrobin",sticky = true,connections = 2)
    public DemoService demoService;
    @Reference(connections = 2)
    public StubTestService  stubTestService;

    @ResponseBody
    @RequestMapping("/hello/{value}")
    public String hello(@PathVariable String value){
        //return (((DemoService)context.getBean("demoService")).sayHello(value));
        return demoService.sayHello(value);
    }

    @ResponseBody
    @RequestMapping("/hello2/{value}")
    public String hello2(@PathVariable String value){
        //return (((DemoService)context.getBean("demoService")).sayHello(value));
        return stubTestService.sayHello(value);
    }
}
