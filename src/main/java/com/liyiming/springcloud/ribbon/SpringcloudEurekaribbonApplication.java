package com.liyiming.springcloud.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudEurekaribbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaribbonApplication.class, args);
	}
	/**
	 * 
	 * <p>Title: restTemplate</p>  
	 * <p>Description:负载均衡的RestTemplate </p>  
	 * @user liyiming
	 * @date 2018年4月12日
	 * @return
	 */
	@Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
