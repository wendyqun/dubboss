package cn.injava.dubboss.service.impl;

import cn.injava.dubboss.api.StubTestService;

/**
 * @author Li GQ 2018/9/8
 */
public class StubTestServiceImpl implements StubTestService {
    @Override
    public String sayHello(String name) {
        return "StubTestServiceImpl server "+name;
    }
}
