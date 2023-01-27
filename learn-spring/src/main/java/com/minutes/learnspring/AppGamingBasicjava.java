package com.minutes.learnspring;

import com.minutes.learnspring.game.GameRunner;
import com.minutes.learnspring.game.MarioGame;
import com.minutes.learnspring.game.Pacman;
import com.minutes.learnspring.game.contraGame;

public class AppGamingBasicjava {

	public static void main(String[] args) {

//var Game=new MarioGame();	
//var Game=new contraGame();
var game=new Pacman();
var gameRunner=new GameRunner(game);
gameRunner.run();
	}

}
