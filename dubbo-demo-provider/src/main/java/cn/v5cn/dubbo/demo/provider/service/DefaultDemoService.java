package cn.v5cn.dubbo.demo.provider.service;

import cn.v5cn.dubbo.demo.service.DemoService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author Administrator
 * @date 2018/7/24
 */
@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}"
)
public class DefaultDemoService implements DemoService {
    @Override
    public String sayHello(String name) {
        return name + " say hello!";
    }
}
