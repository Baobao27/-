package װ��ģʽ;

public class Egg extends Decorator{

	public Egg(HamBurg hamburg) {
		super(hamburg);
	}

	public void chicken() {
		System.out.println("��̫���� 2Ԫ");
	}
	
	public void makeburg() {
		super.money=super.money+2;
		super.makeburg();
		this.chicken();
	}
}
