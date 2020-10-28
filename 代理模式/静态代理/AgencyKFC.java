package 静态代理;

public class AgencyKFC implements Hamburg{

	MakeBurg amkeBurg=null;
	public void addmakeBurg(MakeBurg makeburg) {
		this.amkeBurg=makeburg;
	}
	@Override
	public void prepare() {
		add("准备材料");
		amkeBurg.prepare();
	}

	@Override
	public void making() {
		add("处理食材");
		amkeBurg.making();
	}

	@Override
	public void packag() {
		add("打包汉堡");
		amkeBurg.packag();
	}
	
	public void add(String msg) {
		System.out.println("KFC正在为你"+msg);
	}

}
