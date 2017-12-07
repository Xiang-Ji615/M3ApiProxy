package main.java.angular2.dao.dao;

import java.io.IOException;
import java.util.List;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import main.java.angular2.dao.model.User;

public interface IUserDao {

	List<User> getUsers() throws JsonIOException, JsonSyntaxException, IOException;
}
