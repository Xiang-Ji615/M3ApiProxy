package main.java.angular2.dao.dao;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;

import com.google.gson.Gson;

public abstract class AbstractUserDao {
	
	@Autowired
	ResourceLoader resourceLoader;
	
	@Autowired
	protected Gson gson;
	
	@Value(value="${sample.data.path:classpath:SampleData.json}")
	String sampleDataPath;

	protected InputStream readFile(String filePath) throws IOException {
		return resourceLoader.getResource(filePath).getInputStream();
	}
}
