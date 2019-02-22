package cn.v5cn.dubbo.demo.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "cn.v5cn.dubbo.demo.provider.service")
public class DubboDemoProviderApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DubboDemoProviderApplication.class).web(WebApplicationType.NONE).run(args);
		//SpringApplication.run(DubboDemoProviderApplication.class, args);
	}
}
