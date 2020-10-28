package ���ݿ�;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;


public class Library {

	static Connection con;
	static PreparedStatement ps;
	static ResultSet res;
	
	//ͨ���˺�ƥ��Ψһ�û�
	public Connection getConnection() throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.jdbc.Driver");//�������ݿ�������
		//ͨ���������ݿ��URL��ȡ���ݿ����Ӷ���
		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/book","root","642540");
		return con;
	}
	
	public void ID(int id) {
		try {
			ps=(PreparedStatement) con.prepareStatement("select * from user");
			res=ps.executeQuery();
			int id1 = 0;
			while(res.next()) {
				id1=res.getInt(1);
				if(id1==id) {
					System.out.println(id1+" "+res.getString(2));
					break;
				}else {
					id1=0;
				}
			}
			if(id1==0) {
				System.out.println("���û�������");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			try {
			if(res!=null) {
				res.close();
				res=null;
			}
			if(ps!=null) {
				ps.close();
				ps=null;
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	}
	
	//ͨ���û�id��ȡ�����û�����ʷ�����鼮
	public void history(int id) {
		try {
			ps=(PreparedStatement) con.prepareStatement("select * from history");
			res=ps.executeQuery();
			int id1 = 0;
			while(res.next()) {
				id1=res.getInt(1);
				if(id1==id) {
					System.out.println(id1+" "+res.getString(2)+" "+res.getString(3)+" "+res.getDate(4));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			try {
			if(res!=null) {
				res.close();
				res=null;
			}
			if(ps!=null) {
				ps.close();
				ps=null;
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	}
	
	//ͨ���鼮���ͻ�ȡ�������µ������鼮
	public void books(String type) {
		try {
			ps=(PreparedStatement) con.prepareStatement("select * from books");
			res=ps.executeQuery();
			String type1=null;
			while(res.next()) {
				type1=res.getString(2);
				if(type1.equals(type)) {
					System.out.println(res.getString(1)+" "+res.getString(2));
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			try {
			if(res!=null) {
				res.close();
				res=null;
			}
			if(ps!=null) {
				ps.close();
				ps=null;
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	}
	
	//ͨ���鿴�鼮�Ľ�����ʷ
	public void bookhistory(String name) {
		try {
			ps=(PreparedStatement) con.prepareStatement("select * from history");
			res=ps.executeQuery();
			String name1=null;
			while(res.next()) {
				name1=res.getString(3);
				if(name1.equals(name)) {
					System.out.println(res.getString(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getDate(4));
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			try {
			if(res!=null) {
				res.close();
				res=null;
			}
			if(ps!=null) {
				ps.close();
				ps=null;
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Library library=new Library();
		try {
			con=library.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("�������ѯ�û�id");
		int id1=sc.nextInt();
		library.ID(id1);
		
		System.out.println("�������ѯ��ʷ���ļ�¼�û�id");
		int id2=sc.nextInt();
		library.history(id2);
		
		System.out.println("�������ѯ�鼮��������");
		String name1=sc.next();
		library.books(name1);
		
		System.out.println("�������ѯ��ʷ���ļ�¼�鼮����");
		String name2=sc.next();
		library.books(name2);
	}

}
