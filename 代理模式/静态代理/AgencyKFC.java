package ��̬����;

public class AgencyKFC implements Hamburg{

	MakeBurg amkeBurg=null;
	public void addmakeBurg(MakeBurg makeburg) {
		this.amkeBurg=makeburg;
	}
	@Override
	public void prepare() {
		add("׼������");
		amkeBurg.prepare();
	}

	@Override
	public void making() {
		add("����ʳ��");
		amkeBurg.making();
	}

	@Override
	public void packag() {
		add("�������");
		amkeBurg.packag();
	}
	
	public void add(String msg) {
		System.out.println("KFC����Ϊ��"+msg);
	}

}
