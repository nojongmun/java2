package com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex01 {
	public static void main(String[] args) {
		Connection conn = null;
		// 동적바인딩을 이용한 구문 생성
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			// 접속정보
			String url = "jdbc:oracle:thin:@203.236.220.55:1521:xe";
			String user = "hr";
			String password = "1111";
			// 드라이버 로딩

			conn = DriverManager.getConnection(url, user, password);

			String sql = "select * from member order by idx";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getString(5) + "\t");
				System.out.print(rs.getString(6) + "\n");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
