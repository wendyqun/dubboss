package cn.injava.dubboss.api;

/**
 * @author Li GQ 2018/9/8
 */
public class StubTestServiceStub implements StubTestService{
    private StubTestService stubTestService;

    public StubTestServiceStub(StubTestService stubTestService){
        this.stubTestService=stubTestService;
    }
    @Override
    public String sayHello(String  name) {
        if("client".equals(name)){
            return "from client";
        }else{
            return stubTestService.sayHello(name);
        }

    }
}
