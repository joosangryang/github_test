package joo.singleton.impl;

public class SettingsImpl {
	
	private static SettingsImpl instance;
	
	private SettingsImpl() {}
	
	public static SettingsImpl getInstance() {
		
		if(instance == null) {
			new SettingsImpl();
		}
		
		return instance;
	}

}
