package װ��ģʽ;

public class Client {

	public static void main(String[] args) {
		HamBurg hamburg=new Concrete();
		hamburg=new Chicken(hamburg);
		hamburg=new Beef(hamburg);
		hamburg=new Vegetables(hamburg);
		hamburg=new Pork(hamburg);
		hamburg=new Tomatoes(hamburg);
		hamburg=new Egg(hamburg);
		hamburg.makeburg();
		System.out.println("����Ҫ֧����"+HamBurg.money+"Ԫ");
		
	}

}
