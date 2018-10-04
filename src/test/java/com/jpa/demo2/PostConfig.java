package com.jpa.demo2;

import com.jpa.demo2.post.PostListner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostConfig {
    @Bean
    public PostListner puPostListner(){
        return new PostListner();
    }

}
