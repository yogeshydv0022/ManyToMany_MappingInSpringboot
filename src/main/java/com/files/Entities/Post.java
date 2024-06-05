package com.files.Entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Post_ManyToMany")
public class Post {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@ManyToMany(mappedBy = "post",cascade = CascadeType.ALL)
	//@JsonBackReference
	private List<User> user;

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

	public List<User> getList() {
		return user;
	}

	public void setList(List<User> user) {
		this.user = user;
	}

	public Post(int id, String name, List<User> user) {
		super();
		this.id = id;
		this.name = name;
		this.user = user;
	}

	public Post() {
		
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", name=" + name + ", user=" + user + "]";
	}
	
	

}
