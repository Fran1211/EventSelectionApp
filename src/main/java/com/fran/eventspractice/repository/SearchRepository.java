package com.fran.eventspractice.repository;

import com.fran.eventspractice.models.Post;

import java.util.List;

public interface SearchRepository
{
   List<Post> findByText(String text);
}
