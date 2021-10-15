package joo.strategy.main;

import joo.strategy.impl.MonitorDB;
import joo.strategy.impl.UsePostgreImpl;
import joo.strategy.impl.UseTiberoImpl;
import joo.strategy.inf.MonitorDBInf;

public class MonitorDbMain {

	public static void main(String[] args) {
		
		
		MonitorDB mDb = new MonitorDB();
		mDb.useDB();
		
		mDb.setDb(new UsePostgreImpl());
		mDb.useDB();
		
		mDb.setDb(new UseTiberoImpl());
		mDb.useDB();
		

		
		
	}

}
