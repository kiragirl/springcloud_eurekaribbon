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

    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }
}
