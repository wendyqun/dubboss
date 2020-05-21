package cn.injava.dubboss.service.impl;

import cn.injava.dubboss.api.DemoService;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;

/**
 * 对api实现的服务提供者
 *
 * Created by apple on 16/2/18.
 */
@Service(timeout = 13000,cluster = "failfast")
public class DemoServiceImpl implements DemoService {

    private String sex;
    private String age;
    @Override
    public String sayHello(String name) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String res=System.currentTimeMillis() + ", response form provider: " + RpcContext.getContext().getLocalAddress();
        System.out.println(res);
        return res;
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
}
