package �̲�;

public class MilkCover extends Decorator{
	
	public MilkCover(MilkTea milktea) {
		super(milktea);
	}
	
	public void pearl() {
		System.out.println("���̸� 3Ԫ");
	}
	
	public void makeTea() {
		super.money=super.money+3;
		super.makeTea();
		this.pearl();
	}
}
