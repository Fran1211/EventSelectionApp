package com.fran.eventspractice.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "events")
public class Post {
    private String name;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Post()
    {

    }

    @Override
    public String toString() {
        return "Post{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
