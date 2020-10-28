package 装饰模式;

public class Tomatoes extends Decorator{

	public Tomatoes(HamBurg hamburg) {
		super(hamburg);
	}

	public void chicken() {
		System.out.println("加番茄 8元");
	}
	
	public void makeburg() {
		super.money=super.money+8;
		super.makeburg();
		this.chicken();
	}
}
