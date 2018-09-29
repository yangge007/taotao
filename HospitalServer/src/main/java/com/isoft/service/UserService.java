package com.isoft.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.isoft.db.entity.User;

@Service
public class UserService {

	public User findUserByUid(String uid) {
		// TODO Auto-generated method stub
		
		User user=new User();
		user.setId(UUID.randomUUID().toString());
		user.setUid("admin");
		user.setNickname("管理员");
		
		return user;
	}

	public List<User> searchUserByExample(User example) {
		// TODO Auto-generated method stub
		
		java.util.List<User> result=new ArrayList<User>();
		User user=null;
		for(int i=0;i<10;i++) {
			user=new User();
			user.setId(UUID.randomUUID().toString());
			user.setUid("admin"+i);
			user.setNickname("管理员"+i);
			result.add(user);
		}
		
		return result;
	}

}
