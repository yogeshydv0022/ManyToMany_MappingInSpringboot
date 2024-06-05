package com.files.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.files.Entities.User;

@Component
public class UserDao  {
	
	@Autowired
	private UserRepository ur;
	
	
	public User saveUser(User u)
	{
		User user=null;
		user=ur.save(u);
		System.out.println(user);
		return user;	
	}
	public List<User> getUsers(){
		List<User> ulist=null;
		ulist=ur.findAll();
		ulist.forEach(System.out::println);
		return ulist;
	}
	
	public User UserFindById(int id) {
		User user=null;
		user=ur.findById(id).get();
		System.out.println(user);
		return user;	
	}
	
	public void deleteUser (int id) {
		 ur.deleteById(id);
		System.out.println(id+" This Record has been Deleted");
	}
	
	public User updateUser(User u,int id)
	{
		User user=null;
		user=UserFindById(id);
		if(user!=null) {
			u.setId(id);
			ur.save(u);
			System.out.println("Record Update :" +user);
		}
		else {
			System.out.println("Record do not Update");
		}
		return user;
	}
}
