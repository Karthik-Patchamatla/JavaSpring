package com.spring.learningSpring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {
    public void up() {
        System.out.println("Mario Jump");
    }

    public void down() {
        System.out.println("Mario Down");
    }

    public void left() {
        System.out.println("Mario Left");
    }

    public void right() {
        System.out.println("Mario Right");
    }
}
