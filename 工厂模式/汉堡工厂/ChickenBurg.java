package ��������;

public class ChickenBurg implements Hamburg{

	@Override
	public void prepare() {
		System.out.println("׼����ۣ����⣬��ˣ����ѣ����ϵ�");
	}

	@Override
	public void making() {
		System.out.println("�����ţ������...");
		System.out.println("ը���ţ�ϴ��ˣ��з���...");
		System.out.println("��ӽ���,���ʳ��...");
		System.out.println("�������ȱ��������...");
	}

	@Override
	public void packag() {
		System.out.println("�ð�װֽ���");
	}

}
