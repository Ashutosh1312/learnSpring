package com.minutes.learnspring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class GameRunner {
	GamingConsole game;
public GameRunner(@Qualifier("contraGameQualifier")GamingConsole game) {
	this.game=game;
	
}
public void run() {
System.out.println("running game"+game);
game.up();
game.down();
game.left();
game.right();
}
}
