package 装饰模式;

public class Vegetables extends Decorator{

	public Vegetables(HamBurg hamburg) {
		super(hamburg);
	}

	public void chicken() {
		System.out.println("加青菜 9元");
	}
	
	public void makeburg() {
		super.money=super.money+9;
		super.makeburg();
		this.chicken();
	}
}
