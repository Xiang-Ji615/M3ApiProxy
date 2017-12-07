package main.java.angular2.web.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RestfulControllerAspect {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Before(value="execution(* main.java.angular2.web.controller.RestfulController.*(..)) && @annotation(org.springframework.web.bind.annotation.RequestMapping) ")
	public void before() {
		logger.info("Before restful method");
	}
}
