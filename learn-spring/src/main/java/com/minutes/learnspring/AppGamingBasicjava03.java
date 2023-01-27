package com.minutes.learnspring;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.minutes.learnspring.game.GameRunner;
import com.minutes.learnspring.game.GamingConsole;
import com.minutes.learnspring.game.MarioGame;
import com.minutes.learnspring.game.Pacman;
import com.minutes.learnspring.game.contraGame;
@Configuration
@ComponentScan("com.minutes.learnspring.game")

public class AppGamingBasicjava03 {
/*	@Bean
public GamingConsole game() {
		var game=new Pacman();
	return game();
	}

	@Bean
public GameRunner gameRunner(GamingConsole game) {
	var gameRunner=new GameRunner(game);
	return gameRunner;
	}*/
	public static void main(String[] args) {
try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppGamingBasicjava03.class)) {
	context.getBean(GamingConsole.class).up();
	context.getBean(GameRunner.class).run();
} catch (BeansException e) {
	e.printStackTrace();
}
	
	}
}


