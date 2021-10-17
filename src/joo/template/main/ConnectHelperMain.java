package joo.template.main;

import joo.template.abst.AbstConnectHelper;
import joo.template.impl.DefaultConnectHelperImpl;

public class ConnectHelperMain {

	public static void main(String[] args) throws Exception {
	
		 AbstConnectHelper helper =  new DefaultConnectHelperImpl();
		 
		 helper.requestConnection("decoded info");
		 

	}

}
