package 汉堡工厂;

public class ChickenBurg implements Hamburg{

	@Override
	public void prepare() {
		System.out.println("准备面粉，鸡肉，青菜，番茄，酱料等");
	}

	@Override
	public void making() {
		System.out.println("揉面团，做面包...");
		System.out.println("炸鸡排，洗青菜，切番茄...");
		System.out.println("添加酱料,组合食材...");
		System.out.println("香辣鸡腿堡制作完成...");
	}

	@Override
	public void packag() {
		System.out.println("用包装纸打包");
	}

}
