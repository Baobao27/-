package �̲�;

public class Order {

	public static void main(String[] args) {
		MilkTea milktea=new PureTea();
		milktea=new Pearl(milktea);
		milktea=new MilkCover(milktea);
		milktea=new Pudding(milktea);
		milktea.makeTea();
		System.out.println("����Ҫ֧����"+MilkTea.money+"Ԫ");
	}

}
