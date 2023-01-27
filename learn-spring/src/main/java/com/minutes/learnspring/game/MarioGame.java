package com.minutes.learnspring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {
public void up() {
	System.out.println("jump");
	
}
public void down() {
	System.out.println("go into hole");
}


public void left() {
	System.out.println("move back");
}public void right() {
	System.out.println("move forward");
}
}