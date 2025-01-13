package com.learning.RestAPI;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getAllCourses() {
        // Return list of courses
        return Arrays.asList(
            new Course(1, "Ramayana", "Valmiki"),
            new Course(2, "Mahabharat", "Vyasa"),
            new Course(3, "Bhagavad Gita", "Vyasa")
        );
    }
}
