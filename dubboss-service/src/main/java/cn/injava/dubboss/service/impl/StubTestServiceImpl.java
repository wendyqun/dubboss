package cn.injava.dubboss.service.impl;

import cn.injava.dubboss.api.StubTestService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author Li GQ 2018/9/8
 */
@Service
public class StubTestServiceImpl implements StubTestService {
    @Override
    public String sayHello(String name) {
        return "StubTestServiceImpl server "+name;
    }
}
