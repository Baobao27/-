package װ��ģʽ;

public class Beef extends Decorator{
	
	public Beef(HamBurg hamburg) {
		super(hamburg);
	}

	public void chicken() {
		System.out.println("��ţ��� 5Ԫ");
	}
	
	public void makeburg() {
		super.money=super.money+5;
		super.makeburg();
		this.chicken();
	}
}
