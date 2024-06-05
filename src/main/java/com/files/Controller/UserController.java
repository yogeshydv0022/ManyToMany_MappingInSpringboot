package com.files.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.files.Entities.User;
import com.files.Repository.UserDao;

@RestController
public class UserController {
	
	@Autowired
	private UserDao udao;
	
	@PostMapping("/user")
	public User saveUser (@RequestBody User u) {
		return udao.saveUser(u);	
	}
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return udao.getUsers();
		
	}

}
