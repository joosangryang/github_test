package joo.strategy.impl;

import joo.strategy.inf.MonitorDBInf;

public class UsePostgreImpl implements MonitorDBInf {

	@Override
	public void doUse() {
		System.out.println("PostgreDB using !! ");
	}

}
