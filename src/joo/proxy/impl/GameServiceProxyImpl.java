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
		System.out.println("���ڸ��� �����Ͻ� �������� �������� ȯ���մϴ�.");
		System.out.println(System.currentTimeMillis() - before);

	}

}
