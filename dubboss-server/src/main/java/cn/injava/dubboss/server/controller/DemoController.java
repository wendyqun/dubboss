package cn.injava.dubboss.server.controller;

import cn.injava.dubboss.api.DemoService;
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
public class DemoController/* implements ApplicationContextAware*/{
    /*ApplicationContext context;*/
    @Reference
    public DemoService demoService;

    @ResponseBody
    @RequestMapping("/hello/{value}")
    public String hello(@PathVariable String value){
        //return (((DemoService)context.getBean("demoService")).sayHello(value));
        return demoService.sayHello(value);
    }

    /*@Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=applicationContext;
    }*/
}
