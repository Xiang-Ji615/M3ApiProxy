package main.java.angular2.dao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;

@Configuration
@ComponentScan(basePackages= {"main.java"})
public class DaoConfig {

	@Bean
	public Gson getGson() {
		return new Gson();
	}
}
