package cn.injava.dubboss.server.controller;

import cn.injava.dubboss.api.DemoService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * springmvc的controller层
 *
 * Created by apple on 16/2/18.
 */
@Controller
public class DemoController implements ApplicationContextAware{
    ApplicationContext context;
    @Autowired
    public DemoService demoProxyService;

    @ResponseBody
    @RequestMapping("/hello/{value}")
    public String hello(@PathVariable String value){
        //return (((DemoService)context.getBean("demoService")).sayHello(value));
        return demoProxyService.sayHello(value);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=applicationContext;
    }
}
