package cn.injava.dubboss.server.service;

import cn.injava.dubboss.api.DemoService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author Li GQ 2018/10/24
 */
@Service
public class DemoProxyService extends AbstractService implements DemoService{
    @Override
    public String sayHello(String name) {
        return demoService.sayHello(name);
    }

    @Override
    public String sayBye(String name) {
        return demoService.sayBye(name);
    }
}
