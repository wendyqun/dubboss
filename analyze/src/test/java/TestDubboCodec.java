import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.common.serialize.support.dubbo.Builder;
import com.alibaba.dubbo.common.serialize.support.dubbo.GenericObjectInput;
import com.alibaba.dubbo.common.serialize.support.dubbo.GenericObjectOutput;
import com.alibaba.dubbo.common.utils.ReflectUtils;
import com.alibaba.dubbo.remoting.buffer.ChannelBufferInputStream;
import com.alibaba.dubbo.remoting.buffer.ChannelBufferOutputStream;
import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.Protocol;
import com.alibaba.dubbo.rpc.protocol.dubbo.DubboCodec;
import org.junit.Test;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author Li GQ 2019/1/29
 */
public class TestDubboCodec {

    public static void main(String[] args) {
        DubboCodec dubboCodec = new DubboCodec();
    }

    @Test
    public void f1() throws Exception {
        com.alibaba.dubbo.remoting.buffer.ChannelBuffer buffer =
                com.alibaba.dubbo.remoting.buffer.ChannelBuffers.dynamicBuffer(1024);
        OutputStream out = new ChannelBufferOutputStream(buffer);
        GenericObjectOutput output = new GenericObjectOutput(out);


        output.writeUTF("nihao");

        buffer.resetReaderIndex();
        InputStream in = new ChannelBufferInputStream(buffer);
        GenericObjectInput input = new GenericObjectInput(in);
        System.out.println(input.readUTF());

    }

    @Test
    public void f2(){
        byte b[]=new byte[9];
        int ix=0;
        //1    10000110 10100111
        //b[3] b[2]     b[1]
        int v=100007;
        while (true) {
            int k;
            //先处理最右边8位
            b[k=++ix] = (byte) (v & 0xff);
            System.out.println(Integer.toHexString(b[k]));
            System.out.println(b[k]);
            if ((v >>>= 8) == 0)
                break;
        }
    }

    @Test
    public void f3(){
        System.out.println(ReflectUtils.getDesc(User.class));
        Builder b = Builder.register(User.class, false);
        System.out.println();
    }

    @Test
    public void f4(){
        Protocol protocol=ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("registry");
        protocol.hashCode();
    }

    @Test
    public void f5() throws  Exception{
        System.out.println(Thread.currentThread().getContextClassLoader().toString());
        new Thread(()->{
            System.out.println(getClass().getClassLoader().toString());
        }).start();

        Thread.sleep(5000);
    }

    @Test
    public void f6() {
        System.out.println(null instanceof Object);
    }
}
