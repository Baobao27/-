package 装饰模式;

public class Pork extends Decorator{

	public Pork(HamBurg hamburg) {
		super(hamburg);
	}

	public void chicken() {
		System.out.println("加猪肉饼 3元");
	}
	
	public void makeburg() {
		super.money=super.money+3;
		super.makeburg();
		this.chicken();
	}
}
