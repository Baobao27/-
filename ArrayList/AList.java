
public class AList {
	private int size=0;//��¼����Ԫ�صĸ���
	private Object arr[]=new Object[1];
	//���Ԫ��
	public void add(Object obj) {
		arr[size]=obj;
		int length=arr.length;
		Object[] arr2 = new Object[arr.length + 1];//��������������
		for(int i = 0;i<length;i++) {
			arr2[i]=arr[i];
		}
		arr=arr2;//�����鸲��ԭ����
		size++;
	}
	//ɾ��Ԫ��
	public void remove(int index) throws Exception {
		if(index<0||index>=size) {
			throw new Exception("�����������");
		}else {
			for(int i=index;i<size-1;i++) {
				arr[i]=arr[i+1];
			}
		size--;
		}
	}
	//��ȡָ��Ԫ��
	public Object get(int index) throws Exception {
		if(index<0||index>=size) {
			throw new Exception("�����������");
		}else {
			return arr[index];
		}
	}
	//��ѯԪ�ظ���
	public int size() {
		return size;
	}

}
