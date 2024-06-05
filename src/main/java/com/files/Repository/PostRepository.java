package com.files.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.files.Entities.Post;

public interface PostRepository extends JpaRepository<Post,Integer> {

}
