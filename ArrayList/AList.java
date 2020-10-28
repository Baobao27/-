
public class AList {
	private int size=0;//记录数组元素的个数
	private Object arr[]=new Object[1];
	//添加元素
	public void add(Object obj) {
		arr[size]=obj;
		int length=arr.length;
		Object[] arr2 = new Object[arr.length + 1];//建立新数组扩容
		for(int i = 0;i<length;i++) {
			arr2[i]=arr[i];
		}
		arr=arr2;//新数组覆盖原数组
		size++;
	}
	//删除元素
	public void remove(int index) throws Exception {
		if(index<0||index>=size) {
			throw new Exception("输入参数错误");
		}else {
			for(int i=index;i<size-1;i++) {
				arr[i]=arr[i+1];
			}
		size--;
		}
	}
	//获取指定元素
	public Object get(int index) throws Exception {
		if(index<0||index>=size) {
			throw new Exception("输入参数错误");
		}else {
			return arr[index];
		}
	}
	//查询元素个数
	public int size() {
		return size;
	}

}
