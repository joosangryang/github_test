package joo.strategy.impl;

import joo.strategy.inf.AInterface;

public class Aobj {

	AInterface ainterface;
	
	public Aobj()
	{
		ainterface = new AInterfaceImpl();
	}
	
	public void funcAA()
	{
		ainterface.funcA();
	}
}
