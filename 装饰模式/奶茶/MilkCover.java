package ÄÌ²è;

public class MilkCover extends Decorator{
	
	public MilkCover(MilkTea milktea) {
		super(milktea);
	}
	
	public void pearl() {
		System.out.println("¼ÓÄÌ¸Ç 3Ôª");
	}
	
	public void makeTea() {
		super.money=super.money+3;
		super.makeTea();
		this.pearl();
	}
}
