package com.spring.learningSpring;

import org.springframework.stereotype.Component;

import com.spring.GamingConsole;

@Component
public class SuperContra implements GamingConsole {

    public void up() {
        System.out.println("SuperContra up");
    }

    public void down() {
        System.out.println("SuperContra down");
    }

    public void left() {
        System.out.println("SuperContra left");
    }

    public void right() {
        System.out.println("SuperContra right");
    }
}
