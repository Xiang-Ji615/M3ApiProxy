package main.java.angular2.web.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import main.java.angular2.dao.model.User;

@RestController
@RequestMapping(value="Rest/V1")
@CrossOrigin
public class RestfulController extends AbstractRestfulController implements IRestfulController{

	@RequestMapping(value="GetUsers", method=RequestMethod.GET)
	@Override
	public List<User> getUsers() throws JsonIOException, JsonSyntaxException, IOException {
		// TODO Auto-generated method stub
		return bo.getUsers();
	}

}
