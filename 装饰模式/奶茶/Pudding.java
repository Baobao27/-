package ÄÌ²è;

public class Pudding extends Decorator{

	public Pudding(MilkTea milktea) {
		super(milktea);
	}
	
	public void pearl() {
		System.out.println("¼Ó²¼¶¡ 2Ôª");
	}
	
	public void makeTea() {
		super.money=super.money+2;
		super.makeTea();
		this.pearl();
	}
}
