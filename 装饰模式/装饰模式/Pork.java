package װ��ģʽ;

public class Pork extends Decorator{

	public Pork(HamBurg hamburg) {
		super(hamburg);
	}

	public void chicken() {
		System.out.println("������� 3Ԫ");
	}
	
	public void makeburg() {
		super.money=super.money+3;
		super.makeburg();
		this.chicken();
	}
}
