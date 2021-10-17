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
			throw new Exception("����");
		}else {
			i = authorization(userName);
			
			switch (i) {
			case 0:
				System.out.println("���Ѿ���");
				break;
			case 1:
				System.out.println("��������");
				break;
			default:
				System.out.println("��Ÿ����");
				break;
			}
		}
		
		return connection(decodedInfo);
	}

}
