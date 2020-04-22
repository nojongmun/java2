package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {
	public static void main(String[] args) {
      Connection conn = null;
      Statement stmt = null;
      ResultSet rs = null;
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			// 접속 정보
			String url = "jdbc:oracle:thin:@203.236.220.55:1521:xe";
			String user = "hr";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			// sql 작성
			// String sql = "select * from employees where employee_id = 108";
			// String sql = "select * from employees where employee_id >= 108 and employee_id <= 112";
			String sql = "select * from employees where last_name = 'King'";
			// 구문생성
			stmt = conn.createStatement();
			// sql를 담아서 보내고 결과 받기
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getString(5)+"\t");
				System.out.print(rs.getString(6)+"\t");
				System.out.print(rs.getString(7)+"\t");
				System.out.print(rs.getString(8)+"\t");
				System.out.print(rs.getString(9)+"\t");
				System.out.print(rs.getString(10)+"\t");
				System.out.print(rs.getString(11)+"\n");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
