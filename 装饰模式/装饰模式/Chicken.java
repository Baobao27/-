package װ��ģʽ;

public class Chicken extends Decorator{

	public Chicken(HamBurg hamburg) {
		super(hamburg);
	}

	public void chicken() {
		System.out.println("�Ӽ��� 10Ԫ");
	}
	
	public void makeburg() {
		super.money=super.money+10;
		super.makeburg();
		this.chicken();
	}
}
