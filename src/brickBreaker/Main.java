package brickBreaker;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame obj = new JFrame();
		Gameplay gamePlay = new Gameplay();	
		
		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Brick Breaker: By Ronitrocket; Version 2.1: The Empowered Update!");
		obj.setResizable(false);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setLocationRelativeTo(null);
		obj.add(gamePlay);
		obj.setVisible(true);
		
	}
}
