package 静态代理;

public class MakeBurg implements Hamburg{

	@Override
	public void prepare() {
		System.out.println("准备面粉，肉片，青菜，番茄，酱料等");
	}

	@Override
	public void making() {
		System.out.println("揉面团，做面包...");
		System.out.println("炸肉片,洗青菜，切番茄...");
		System.out.println("添加酱料,组合食材...");
		System.out.println("秘制牛肉堡制作完成...");
	}

	@Override
	public void packag() {
		System.out.println("用纸盒打包");
	}

}
