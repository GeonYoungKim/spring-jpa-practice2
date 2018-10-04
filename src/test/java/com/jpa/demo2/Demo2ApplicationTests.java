package com.jpa.demo2;

import com.jpa.demo2.post.Post;
import com.jpa.demo2.post.PostRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo2ApplicationTests {

    @Autowired
    PostRepository postRepository;

    @Test
    public void contextLoads() {

    }

}
