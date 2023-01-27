package com.minutes.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.minutes.learnspring.game.GameRunner;
import com.minutes.learnspring.game.GamingConsole;
import com.minutes.learnspring.game.Pacman;

@Configuration
public class GamingConfig {
	
	
	@Bean
public GamingConsole game() {
		new Pacman();
	return game();
}

	@Bean
public GameRunner gameRunner(GamingConsole game) {
	var gameRunner=new GameRunner(game);
	return gameRunner;

}
}


