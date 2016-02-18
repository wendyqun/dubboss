package cn.injava.dubboss.server.controller;

import cn.injava.dubboss.api.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class DemoController {
    @Autowired
    private DemoService demoService ;

    @ResponseBody
    @RequestMapping("/hello/{value}")
    public String hello(@PathVariable String value){
        return demoService.sayHello(value) ;
    }

}
