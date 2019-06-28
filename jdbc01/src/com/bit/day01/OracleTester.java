package com.bit.day01;

import java.sql.SQLException;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

public class OracleTester {

	public static void main(String[] args) {
		oracle.jdbc.driver.OracleDriver driver=null;
		driver=new OracleDriver();
		
		//protocol//[hosts][/database][?properties]
		// ex) jdbc:mysql://hosthost:3306/db
		
		// jdbc:oracle:<drivertype>@ip:port:sid
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		java.util.Properties info = new Properties();
		info.put ("user", "scott");
		info.put ("password","tiger");
		
//		String sql="insert into bonus (ename,job,sal,comm)" +
//				" values (user05,'new', 500, 50)";
		
		String sql="delete from bonus";
		
		java.sql.Connection conn=null;
		java.sql.Statement stmt=null;
		
		try {
			conn=java.sql.DriverManager.getConnection(url, info);
			stmt=conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("입력완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null){conn.close();}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
















