package com.spring.learningSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

// import com.spring.GamingConsole;

@ComponentScan("com.spring.learningSpring")
public class GamingApp {

    // Creating a bean manually....
    // @Bean
    // public GamingConsole game() {
    //     return new PacMan();
    // }

    // @Bean
    // public GameRunner gameRunner(GamingConsole game) {
    //     return new GameRunner(game);
    // }

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GamingApp.class)) {
            // MarioGame game = new MarioGame();
            // SuperContra game = new SuperContra();
            // PacMan game = new PacMan();

            // Bean
            // GameRunner gameRunner = context.getBean(GameRunner.class);

            GameRunner gameRunner = context.getBean(GameRunner.class);
            gameRunner.run();
        }
    }
}
