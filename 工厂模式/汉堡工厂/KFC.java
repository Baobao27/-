package ∫∫±§π§≥ß;

public class KFC {
	public static Hamburg orderburg(String burg) {
		Hamburg hamburg=null;
		if(burg.equals("√ÿ÷∆≈£»‚±§"))
			hamburg=new BeefBurg();
		else if(burg.equals("æﬁŒﬁ∞‘"))
			hamburg=new BigMACBurg();
		else if(burg.equals("œ„¿±º¶Õ»±§"))
			hamburg=new ChickenBurg();
		
		hamburg.prepare();
		hamburg.making();
		hamburg.packag();
		return hamburg;
	}
}
