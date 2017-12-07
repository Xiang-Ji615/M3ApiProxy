package test.java.dao.test;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import main.java.angular2.dao.config.DaoConfig;
import main.java.angular2.dao.dao.IUserDao;
import main.java.angular2.dao.model.User;


@SpringBootTest(classes= {DaoConfig.class})
public class DaoTest extends AbstractTestNGSpringContextTests{
	
	@Autowired
	IUserDao dao;

	@Test
	public void getUserTest() throws JsonIOException, JsonSyntaxException, IOException {
		List<User> users = dao.getUsers();
		assertNotNull(users);
	}
}
