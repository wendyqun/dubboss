package cn.injava.dubboss.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author wangch
 * @version V1.0
 * @Package com.dubbo
 * @Description:
 * @date 2018/1/27 下午3:36
 */
@Configuration
@ImportResource({ "classpath:dubbo/*.xml" })
public class DubboConfig {
}
