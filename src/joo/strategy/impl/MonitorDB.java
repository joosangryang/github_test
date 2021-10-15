package joo.strategy.impl;

import joo.strategy.inf.MonitorDBInf;

public class MonitorDB {
	
	public MonitorDBInf Db;

	public void setDb(MonitorDBInf db) {
		Db = db;
	}
	
	public void useDB() {
		if(Db == null) {
			System.out.println("DB choice");
		}else {
				Db.doUse();
		}
	}

}
