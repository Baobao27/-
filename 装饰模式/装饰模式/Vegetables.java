package װ��ģʽ;

public class Vegetables extends Decorator{

	public Vegetables(HamBurg hamburg) {
		super(hamburg);
	}

	public void chicken() {
		System.out.println("����� 9Ԫ");
	}
	
	public void makeburg() {
		super.money=super.money+9;
		super.makeburg();
		this.chicken();
	}
}
