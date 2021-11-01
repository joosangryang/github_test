package joo.proxy.impl;

public class GameServiceProxy extends GameService {
	
	@Override
	public void startGame() throws InterruptedException {
		long before = System.currentTimeMillis();
		super.startGame();
		System.out.println(System.currentTimeMillis()-before);
	}

}
