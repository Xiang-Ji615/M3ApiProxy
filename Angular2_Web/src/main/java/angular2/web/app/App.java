package main.java.angular2.web.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
@ComponentScan(basePackages= {"main.java"})
@EnableAspectJAutoProxy
public class App extends SpringBootServletInitializer{

	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}
}

