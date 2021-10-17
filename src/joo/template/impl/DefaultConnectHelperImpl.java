package joo.template.impl;

import joo.template.abst.AbstConnectHelper;

public class DefaultConnectHelperImpl extends AbstConnectHelper {

	@Override
	protected String doSecurity(String string) {
		System.out.println("decode start");
		return string;
	}

	@Override
	protected boolean authentication(String id, String passwd) {
		System.out.println("id passwd confirm");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("authorization confirm");
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("마지막접속단계");
		return info;
	}

}
