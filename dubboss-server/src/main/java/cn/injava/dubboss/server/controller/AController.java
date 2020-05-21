package cn.injava.dubboss.server.controller;

import cn.injava.dubboss.api.DemoService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class AController {

    @Reference(loadbalance = "roundrobin",sticky = true,timeout = 10000)
    public DemoService demoService;
}
