package com.jpa.demo2;


import com.jpa.demo2.post.Post;
import com.jpa.demo2.post.PostPublishedEvent;
import com.jpa.demo2.post.PostRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.NONE;

@RunWith(SpringRunner.class)
@DataJpaTest
@Import(PostConfig.class)
@AutoConfigureTestDatabase(replace = NONE)
public class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

    @Test
    public void crud(){
        Post post = new Post();
        post.setTitle("hibernate");
        postRepository.save(post.publish());
        postRepository.findMyPost();
        postRepository.delete(post);
        postRepository.flush();
    }
}
