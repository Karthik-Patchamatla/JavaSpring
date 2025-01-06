package com.spring.learningSpring;

import org.springframework.stereotype.Component;

import com.spring.GamingConsole;

@Component
public class PacMan implements GamingConsole {
    public void up() {
        System.out.println("PacMan forward");
    }

    public void down() {
        System.out.println("PacMan backward");
    }

    public void left() {
        System.out.println("PacMan left");
    }

    public void right() {
        System.out.println("PacMan right");
    }
}
