package com.polymorphism;

public class PlayerPiece extends GameShape implements Animatable {

	public void movePiece(){
		System.out.println("moving game piece");
	}

	@Override
	public void animate() {
		System.out.println("animating...");
	}
	public static void main(String[] args) {
		PlayerPiece player = new PlayerPiece();
		Object obj = player;
		GameShape game = player;
		Animatable animate = player;
		animate.animate();
		game.displayShape();
	}
}
