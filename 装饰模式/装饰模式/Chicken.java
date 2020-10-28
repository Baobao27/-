package 装饰模式;

public class Chicken extends Decorator{

	public Chicken(HamBurg hamburg) {
		super(hamburg);
	}

	public void chicken() {
		System.out.println("加鸡肉 10元");
	}
	
	public void makeburg() {
		super.money=super.money+10;
		super.makeburg();
		this.chicken();
	}
}
