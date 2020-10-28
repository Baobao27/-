package 装饰模式;

public class Beef extends Decorator{
	
	public Beef(HamBurg hamburg) {
		super(hamburg);
	}

	public void chicken() {
		System.out.println("加牛肉饼 5元");
	}
	
	public void makeburg() {
		super.money=super.money+5;
		super.makeburg();
		this.chicken();
	}
}
