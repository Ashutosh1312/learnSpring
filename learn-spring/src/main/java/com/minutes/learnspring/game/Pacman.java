package com.minutes.learnspring.game;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Component
public class Pacman implements GamingConsole{
	public void up() {
		System.out.println("up");
		
	}
	public void down() {
		System.out.println("down");
	}


	public void left() {
		System.out.println("left");
	}public void right() {
		System.out.println("right");
	}
}
