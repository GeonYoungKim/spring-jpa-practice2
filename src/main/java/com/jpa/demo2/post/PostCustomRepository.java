package com.jpa.demo2.post;

import java.util.List;

public interface PostCustomRepository<T> {
    void delete(T entity);
    List<Post> findMyPost();
}
