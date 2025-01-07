package com.spring.learningSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraQualifier")
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
