/**
 * HelloService.java
 * <p>Description: </p>
 * @author Administrator
 * @date 2018年4月12日
 */
package com.liyiming.springcloud.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**  
 * <p>Title: HelloService</p>  
 * <p>Description: </p>  
 * @author liyiming  
 * @date 2018年4月12日  
 */
@Service
public class HelloService {
	
	@Autowired
    private RestTemplate restTemplate;
	/**
	 * <p>Title: hiService</p>  
	 * <p>Description: 熔断器 当发生熔断再请求hiService时调用 hiError</p>  
	 * @user liyiming
	 * @date 2018年7月12日
	 * @param name
	 * @return
	 */
	@HystrixCommand(fallbackMethod="hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
	public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
