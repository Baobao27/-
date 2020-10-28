package 奶茶;

public class Order {

	public static void main(String[] args) {
		MilkTea milktea=new PureTea();
		milktea=new Pearl(milktea);
		milktea=new MilkCover(milktea);
		milktea=new Pudding(milktea);
		milktea.makeTea();
		System.out.println("您需要支付："+MilkTea.money+"元");
	}

}
