package com.files.Entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="User_ManytoMany")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Post> post=new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Post> getPost() {
		return post;
	}

	public void setPost(List<Post> post) {
		this.post = post;
	}

	public User(int id, String name, List<Post> post) {
		super();
		this.id = id;
		this.name = name;
		this.post = post;
	}

	public User() {
		
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", post=" + post + "]";
	}
	

}
