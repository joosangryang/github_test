package joo.proxy.main;

import joo.proxy.impl.GameService;
import joo.proxy.impl.GameServiceImpl;
import joo.proxy.impl.GameServiceProxy;
import joo.proxy.impl.GameServiceProxyImpl;
import joo.proxy.inf.GameServiceInf;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		GameServiceInf game = new GameServiceImpl();
		game.startGame();

	}

}

