package ��������;

public class KFC {
	public static Hamburg orderburg(String burg) {
		Hamburg hamburg=null;
		if(burg.equals("����ţ�Ɽ"))
			hamburg=new BeefBurg();
		else if(burg.equals("���ް�"))
			hamburg=new BigMACBurg();
		else if(burg.equals("�������ȱ�"))
			hamburg=new ChickenBurg();
		
		hamburg.prepare();
		hamburg.making();
		hamburg.packag();
		return hamburg;
	}
}
