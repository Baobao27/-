package 汉堡工厂;

public class Customer {
	public static void main(String[] args) {
		Hamburg hamburg=KFC.orderburg("巨无霸");
		System.out.println("您好，您点的巨无霸以为您制作好了");
		System.out.println();
		Hamburg hamburg2=KFC.orderburg("秘制牛肉堡");
		System.out.println("您好，您点的巨无霸以为您制作好了");
		System.out.println();
		Hamburg hamburg3=KFC.orderburg("香辣鸡腿堡");
		System.out.println("您好，您点的巨无霸以为您制作好了");
		System.out.println();
	}

}
