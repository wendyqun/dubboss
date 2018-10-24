package cn.injava.dubboss.service.impl;

import cn.injava.dubboss.api.DemoService;
import cn.injava.dubboss.api.StubTestService;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 对api实现的服务提供者
 *
 * Created by apple on 16/2/18.
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private StubTestService stubTestService;

    private String sex;
    private String age;
    public String sayHello(String name) {
        stubTestService.sayHello(name);
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }

    @Override
    public String sayBye(String name) {
        System.out.println("====say bye");
        return "bye "+name;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public StubTestService getStubTestService() {
        return stubTestService;
    }

    public void setStubTestService(StubTestService stubTestService) {
        this.stubTestService = stubTestService;
    }
}
