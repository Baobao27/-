
public class textAlist {

	public static void main(String[] args) throws Exception {
		AList list=new AList();
		list.add(1);
		list.add("12");
		list.add(true);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("��С��"+list.size());
		list.remove(2);
		System.out.println("��С��"+list.size());
	}

}
