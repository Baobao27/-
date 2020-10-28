package 装饰模式;

public class Egg extends Decorator{

	public Egg(HamBurg hamburg) {
		super(hamburg);
	}

	public void chicken() {
		System.out.println("加太阳蛋 2元");
	}
	
	public void makeburg() {
		super.money=super.money+2;
		super.makeburg();
		this.chicken();
	}
}
