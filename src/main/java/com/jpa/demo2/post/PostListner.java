package com.jpa.demo2.post;

import org.springframework.context.ApplicationListener;

public class PostListner implements ApplicationListener<PostPublishedEvent> {
    @Override
    public void onApplicationEvent(PostPublishedEvent event) {
        System.out.println("------------------");
        System.out.println(event.getPost()+"is published");
        System.out.println("------------------");
    }
}
