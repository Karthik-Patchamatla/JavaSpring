package com.spring.learningSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole game;

    @Autowired
    GameRunner(@Qualifier("SuperContraQualifier") GamingConsole game){
        this.game = game;
    }

    public void run(){
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
