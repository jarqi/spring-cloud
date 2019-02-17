package zkr.hk.feign_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import zkr.hk.feign_server.server.HelloService;

@RestController
public class HelloController {
	  @Autowired
	    HelloService helloService;
		
	    @RequestMapping("/hello")
		public String getHelloContent() {
			return helloService.hello();
		 }
}