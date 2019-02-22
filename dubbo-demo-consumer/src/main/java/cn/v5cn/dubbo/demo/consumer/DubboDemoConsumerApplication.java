package cn.v5cn.dubbo.demo.consumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboDemoConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboDemoConsumerApplication.class, args);
	}
}
