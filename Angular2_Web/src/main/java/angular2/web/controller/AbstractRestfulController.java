package main.java.angular2.web.controller;

import org.springframework.beans.factory.annotation.Autowired;

import main.java.angualr2.bo.bo.IUserBo;

public abstract class AbstractRestfulController {

	@Autowired
	IUserBo bo;
}
