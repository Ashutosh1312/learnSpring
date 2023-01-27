package com.minutes.learnspring.game;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("contraGameQualifier")
public class contraGame implements GamingConsole {
	public void up() {
		System.out.println("up");
		
	}
	public void down() {
		System.out.println("crouch");
	}


	public void left() {
		System.out.println("baack");
	}public void right() {
		System.out.println("shoot");
	}
}
