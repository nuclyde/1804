package cn.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/**
 * 默认是轮询策略
 */
@SpringBootApplication
@EnableEurekaClient
public class RunAppConsumerUser {
	//注入模板对象
	@Bean  //创建实例交给spring管理
	@LoadBalanced   //Ribbon 实现负载均衡
	public RestTemplate restTemplete(){
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(RunAppConsumerUser.class, args);
	}
}
