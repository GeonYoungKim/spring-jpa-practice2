package com.jpa.demo2.post;

import com.jpa.demo2.MyRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends MyRepository<Post, Long>, PostCustomRepository<Post> {


}
