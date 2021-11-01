package joo.proxy.impl;

import joo.proxy.inf.GameServiceInf;

public class GameServiceProxyImpl implements GameServiceInf {

	private GameServiceImpl gameServiceImpl;
	
	public GameServiceProxyImpl(GameServiceImpl gameServiceImpl) {
		this.gameServiceImpl = gameServiceImpl;
	}
	
	@Override
	public void startGame() {
		long before = System.currentTimeMillis();
		System.out.println("이자리에 참석하신 여러분을 진심으로 환영합니다.");
		System.out.println(System.currentTimeMillis() - before);

	}

}
