package 装饰模式;

public class Concrete extends HamBurg{

	@Override
	public void makeburg() {
		super.money=super.money+10;
		System.out.println("这是一个蟹皇堡 10元");
	}

}
