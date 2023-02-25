package com.springboot.blog.service;

import com.springboot.blog.payload.PostDto;
import com.springboot.blog.payload.PostResponse;

import java.util.List;

public interface PostService  {
    PostDto createPost(PostDto postDto);
   // List<PostDto> getAllPostList();

    //    @Override
    //    public List<PostDto> getAllPost() {
    //        return null;
    //    }
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
    //List<PostDto> getAllPosts(int pageNo,int pageSize);
    //PostDto findById(Long id);
    //PostDto postUpdate(PostDto postDto, Long id);

    PostDto updatePost(PostDto postDto, long id);

    //PostDto findById(long id);

    PostDto getPostById(long id);

   // PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);

}
