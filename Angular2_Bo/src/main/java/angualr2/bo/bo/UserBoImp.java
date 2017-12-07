package main.java.angualr2.bo.bo;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Component;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import main.java.angular2.dao.model.User;

@Component
public class UserBoImp extends AbstractUserBo implements IUserBo {

	@Override
	public List<User> getUsers() throws JsonIOException, JsonSyntaxException, IOException {
		return dao.getUsers();
	}

}
