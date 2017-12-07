package main.java.angular2.dao.dao;

import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import main.java.angular2.dao.model.User;

@Repository
public class UserDaoImp extends AbstractUserDao implements IUserDao{

	@Override
	public List<User> getUsers() throws JsonIOException, JsonSyntaxException, IOException {
		Type listType = new TypeToken<ArrayList<User>>(){}.getType();
		return gson.fromJson(new InputStreamReader(readFile(sampleDataPath)), listType);
	}

}
