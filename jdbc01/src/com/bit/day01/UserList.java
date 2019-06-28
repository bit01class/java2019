package com.bit.day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

public class UserList {

	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		OracleDriver dirver =new OracleDriver();
		
		Properties prop=new Properties();
		prop.put("user", user);
		prop.put("password", password);

		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			conn=DriverManager.getConnection(url, prop);
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select * from bonus");
			
			System.out.println("-----------------------------------------");
			System.out.println("ename\tjob\tsal\tcomm");
			System.out.println("-----------------------------------------");
			
			while(rs.next()){
				System.out.print(rs.getObject(1));
				System.out.print("\t");
				System.out.print(rs.getObject(2));
				System.out.print("\t");
				System.out.print(rs.getObject(3));
				System.out.print("\t");
				System.out.println(rs.getObject(4));
			}

			System.out.println("-----------------------------------------");
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
	}

}













