package joo.strategy.impl;

import joo.strategy.inf.MonitorDBInf;

public class UseTiberoImpl implements MonitorDBInf {

	@Override
	public void doUse() {
		System.out.println("TiberoDB using !!");
	}

}
