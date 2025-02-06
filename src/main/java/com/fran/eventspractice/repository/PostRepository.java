package com.fran.eventspractice.repository;

import com.fran.eventspractice.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String>
{

}
