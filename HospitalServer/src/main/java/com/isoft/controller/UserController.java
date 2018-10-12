package com.isoft.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isoft.db.entity.User;
import com.isoft.service.UserService;

@RestController
@RequestMapping("/logic/user")

public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping("find/{uid}")
	public User findUser(@PathVariable String uid) {
		System.out.println(uid);
		return service.findUserByUid(uid);
	}
	
	@RequestMapping("search")
	public List<User> searchUser(User example) {
		return service.searchUserByExample(example);
	}
	
}
