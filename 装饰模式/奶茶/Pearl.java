package ÄÌ²è;

public class Pearl extends Decorator{

	public Pearl(MilkTea milktea) {
		super(milktea);
	}
	
	public void pearl() {
		System.out.println("¼ÓÕäÖé 1Ôª");
	}
	
	public void makeTea() {
		super.money=super.money+1;
		super.makeTea();
		this.pearl();
	}
}
