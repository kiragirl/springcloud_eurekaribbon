/**
 * HelloController.java
 * <p>Description: </p>
 * @author Administrator
 * @date 2018年4月12日
 */
package com.liyiming.springcloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.liyiming.springcloud.ribbon.service.HelloService;

/**  
 * <p>Title: HelloController</p>  
 * <p>Description: </p>  
 * @author liyiming  
 * @date 2018年4月12日  
 */
@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;
	
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
