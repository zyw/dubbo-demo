package cn.v5cn.dubbo.demo.consumer.controller;

import cn.v5cn.dubbo.demo.service.DemoService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2018/7/24
 */
@RestController
public class DemoController {

    @Reference(
            version = "${demo.service.version}",
            application = "${dubbo.application.id}"
    )
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoService.sayHello(name);
    }

}
