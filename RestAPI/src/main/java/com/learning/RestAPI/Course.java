package com.learning.RestAPI;

public class Course {
    private long id;
    private String name;
    private String author;

    Course(long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "id="
                + id
                + ", name="
                + name
                + ", author="
                + author
                + "]";
    }
}
