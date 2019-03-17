package cn.injava.dubboss.server.controller;

import cn.injava.dubboss.api.DemoService;
import com.alibaba.dubbo.config.annotation.Reference;

/**
 * @author Li GQ 2018/11/2
 */
public abstract class AbstractController {
    protected DemoService demoService;

    @Reference
    public void setDemoService(DemoService demoService) {
        this.demoService = demoService;
    }
}
