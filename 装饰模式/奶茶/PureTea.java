package 奶茶;

public class PureTea extends MilkTea{

	@Override
	public void makeTea() {
		MilkTea.money=MilkTea.money+6;
		System.out.println("这是一杯净奶茶 6元");
		
	}

}
