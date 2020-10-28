package 汉堡工厂;

public class BigMACBurg implements Hamburg{

	@Override
	public void prepare() {
		System.out.println("准备面粉，牛肉，鸡肉，青菜，番茄，酱料等");
	}

	@Override
	public void making() {
		System.out.println("揉面团，做面包...");
		System.out.println("炸牛肉，炸鸡肉，洗青菜，切番茄...");
		System.out.println("添加酱料,组合食材...");
		System.out.println("巨无霸制作完成...");
	}

	@Override
	public void packag() {
		System.out.println("用打包纸加纸盒打包");
	}

}
