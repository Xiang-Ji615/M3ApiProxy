package main.java.angualr2.bo.bo;

import org.springframework.beans.factory.annotation.Autowired;

import main.java.angular2.dao.dao.IUserDao;

public abstract class AbstractUserBo {

	@Autowired
	IUserDao dao;
}
