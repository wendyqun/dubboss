package cn.injava.dubboss.server.service;

import cn.injava.dubboss.api.DemoService;
import com.alibaba.dubbo.config.annotation.Reference;

/**
 * @author Li GQ 2018/10/24
 */
public abstract class  AbstractService {

    @Reference
    protected DemoService demoService;
}
