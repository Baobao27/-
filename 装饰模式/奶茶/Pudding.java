package �̲�;

public class Pudding extends Decorator{

	public Pudding(MilkTea milktea) {
		super(milktea);
	}
	
	public void pearl() {
		System.out.println("�Ӳ��� 2Ԫ");
	}
	
	public void makeTea() {
		super.money=super.money+2;
		super.makeTea();
		this.pearl();
	}
}
