package com.bit.day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class UserInsert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENAME>");
		String input1=sc.nextLine();
		System.out.print("JOB>");
		String input2=sc.nextLine();
		System.out.print("SAL>");
		String input3=sc.nextLine();
		System.out.print("COMM>");
		String input4=sc.nextLine();
		
		
		String sql="insert into bonus (ename,job,sal,comm) ";
		sql+="values ('"+input1+"','"+input2+"',"+input3+","+input4+")";
		
		System.out.println(sql);
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		OracleDriver driver=new OracleDriver();
		
		Connection conn=null;
		Statement stmt=null;
		
		Properties info=new Properties();
		info.put("user", user);
		info.put("password", password);
		
		try {
			conn=DriverManager.getConnection(url, info);
			stmt=conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(stmt!=null){stmt.close();}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			try {
				if(conn!=null){conn.close();}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		System.out.println("작성이 완료되었습니다");
	}

}















