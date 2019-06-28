package com.bit.student;

import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class LMSSystem {

	public static void main(String[] args) {
		// �����������α׷�(ver 0.5.0)
		Scanner sc=new Scanner(System.in);
		System.out.println("----------------------------------");
		System.out.println("�����������α׷�(ver 0.5.0)");
		System.out.println("----------------------------------");
		String input=null;
		int num=0;
		String url="jdbc:oracle:thin:@192.168.0.61:1521:xe";
		String id="scott";
		String pw="tiger";
		Properties prop=new Properties();
		prop.put("user", id);
		prop.put("password", pw);
		
		OracleDriver driver=new OracleDriver();
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		while(true){
			System.out.print("1.���� 2.������� 3.�������� 4.���� 0.����>");
			input=sc.nextLine();
			if("0".equals(input)){break;}
			if("2".equals(input)){
				
				String sql="select nvl(max(num),0)+1 from student01";
				
				try {
					conn=DriverManager.getConnection(url, prop);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					rs.next();
					num=rs.getInt(1);
				} catch (SQLException e) {
					e.printStackTrace();
				} finally{
					try {
						if(rs!=null){rs.close();}
					} catch (SQLException e) {
						e.printStackTrace();
					}
					try {
						if(stmt!=null){stmt.close();}
					} catch (SQLException e) {
						e.printStackTrace();
					}
					try {
						if(conn!=null){conn.close();}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
				
				System.out.print("����>");
				input=sc.nextLine();
				int kor=Integer.parseInt(input);
				System.out.print("����>");
				input=sc.nextLine();
				int eng=Integer.parseInt(input);
				System.out.print("����>");
				input=sc.nextLine();
				int math=Integer.parseInt(input);
				
				String sql2="insert into student01";
				sql2+=" (num,kor,eng,math) values (";
				sql2+=num+","+kor+","+eng+","+math+")";
				try {
					conn=DriverManager.getConnection(url, prop);
					stmt=conn.createStatement();
					stmt.executeUpdate(sql2);
				} catch (SQLException e) {
					e.printStackTrace();
				} finally{
					try {
						if(stmt!=null){stmt.close();}
					} catch (SQLException e) {
						e.printStackTrace();
					}
					try {
						if(conn!=null){conn.close();}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
				
			}else if("1".equals(input)){
				System.out.println("------------------------------------");
				System.out.println("�й�\t����\t����\t����");
				System.out.println("------------------------------------");
				String sql="select * from student01 order by num asc";
				try {
//					conn=DriverManager.getConnection("jdbc:oracle:thin:scott/tiger@localhost:1521:xe");
//					conn=DriverManager.getConnection(url,prop);
					conn=DriverManager.getConnection(url,id,pw);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					while(rs.next()){
						System.out.print(rs.getInt(1)+"\t");
						System.out.print(rs.getInt(2)+"\t");
						System.out.print(rs.getInt(3)+"\t");
						System.out.println(rs.getInt(4));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				} finally{
					try {
						if(rs!=null){rs.close();}
					} catch (SQLException e) {
						e.printStackTrace();
					}
					try {
						if(stmt!=null){stmt.close();}
					} catch (SQLException e) {
						e.printStackTrace();
					}
					try {
						if(conn!=null){conn.close();}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
			}else if("4".equals(input)){
				System.out.print("�й�>");
				input=sc.nextLine();
				input=input.trim();
				int target=0;
				try{
					target=Integer.parseInt(input);
				}catch(NumberFormatException e){
					System.out.println("�Է��� �߸��Ǿ����ϴ�");
					continue;
				}
				int result=0;
				String sql="delete from student01 where num="+target;
				
				try {
					conn=DriverManager.getConnection(url,id,pw);
					stmt=conn.createStatement();
					result=stmt.executeUpdate(sql);
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						if(stmt!=null){stmt.close();}
					} catch (SQLException e) {
						e.printStackTrace();
					}
					try {
						if(conn!=null){conn.close();}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(result>0){
					System.out.println("�����Ǿ����ϴ�");
				}else{
					System.out.println("\tErr) �������");
				}
				
			}else if("3".equals(input)){
				System.out.print("�й�>");
				input=sc.nextLine();
				int target=Integer.parseInt(input);
				System.out.print("����>");
				input=sc.nextLine();
				int kor=Integer.parseInt(input);
				System.out.print("����>");
				input=sc.nextLine();
				int eng=Integer.parseInt(input);
				System.out.print("����>");
				input=sc.nextLine();
				int math=Integer.parseInt(input);
				int result=0;
				String sql="update student01 set kor=";
				sql+=kor+",eng="+eng+",math="+math+" where num="+target;
				
				try {
					conn=DriverManager.getConnection(url,id,pw);
					stmt=conn.createStatement();
					result=stmt.executeUpdate(sql);
				} catch (SQLException e) {
					e.printStackTrace();
				} finally{
					try {
						if(stmt!=null){stmt.close();}
					} catch (SQLException e) {
						e.printStackTrace();
					}
					try {
						if(conn!=null){conn.close();}
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if(result>0){
					System.out.println("�����Ǿ����ϴ�");
				}else{
					System.out.println("\tErr)��������");
				}
			}else{
				System.out.println("�ٽ� Ȯ���Ͻð� �Է����ּ���");
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}

}















