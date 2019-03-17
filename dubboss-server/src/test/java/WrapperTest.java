import cn.injava.dubboss.api.DemoService;
import com.alibaba.dubbo.common.bytecode.Wrapper;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Li GQ 2019/1/28
 */
public class WrapperTest {

    public static void main(String[] args) throws Exception{
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        Wrapper demoWapper=Wrapper.getWrapper(DemoService.class);
        DemoService demoService=new DemoService() {
            @Override
            public String sayHello(String name) {
                return name;
            }

            @Override
            public String sayBye(String name) {
                return name;
            }
        };
        Class<String> [] classes=new Class[1];
        classes[0]=String.class;
        Object[] mgs=new Object[1];
        mgs[0]="nihao";
        try {
            Object res=demoWapper.invokeMethod(demoService,"sayHello",classes,mgs);
            System.out.println(res);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        ExecutorService threadPoolExecutor= Executors.newFixedThreadPool(3);
        threadPoolExecutor.submit(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
