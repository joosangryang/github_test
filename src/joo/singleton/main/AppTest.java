package joo.singleton.main;

import joo.singleton.impl.SettingsImpl;

public class AppTest {

	public static void main(String[] args) {
		
		SettingsImpl set1 = SettingsImpl.getInstance();
		SettingsImpl set2 = SettingsImpl.getInstance();
		
		System.out.println(set1 == set2);
		//°´Ã¼°¡ Æ²¸®´Ù°í ³ª¿È.
		
		
	}

}
