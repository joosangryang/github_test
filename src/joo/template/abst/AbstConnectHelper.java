package joo.template.abst;

public abstract class AbstConnectHelper {
	
	
	
	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id, String passwd);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);

	
	
	public String requestConnection(String encodedInfo) throws Exception {
	
		
		String decodedInfo = doSecurity(encodedInfo);
		
		String id ="aaa";
		String passwd = "bbbb";
		
		String userName = "userName";
		int i;
		
		if(!authentication(id, passwd)) {
			throw new Exception("없음");
		}else {
			i = authorization(userName);
			
			switch (i) {
			case 0:
				System.out.println("권한없음");
				break;
			case 1:
				System.out.println("권한있음");
				break;
			default:
				System.out.println("기타사항");
				break;
			}
		}
		
		return connection(decodedInfo);
	}

}
