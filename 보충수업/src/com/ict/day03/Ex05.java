package com.ict.day03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex05 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 로그인 할때 필요
			String sql = "select * from member id =? and pw=?";
			pstm.setString(1, "hong");
			pstm.setString(2, "hong12");
			rs = pstm.executeQuery();
			
			// String sql = "select * from member id ='hong' and pw='hong12'";
			// rs = pstm.executeQuery();
			while(rs.next()) {
				
			}
		} catch (Exception e) {
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
