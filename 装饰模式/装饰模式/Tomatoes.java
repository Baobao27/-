package װ��ģʽ;

public class Tomatoes extends Decorator{

	public Tomatoes(HamBurg hamburg) {
		super(hamburg);
	}

	public void chicken() {
		System.out.println("�ӷ��� 8Ԫ");
	}
	
	public void makeburg() {
		super.money=super.money+8;
		super.makeburg();
		this.chicken();
	}
}
