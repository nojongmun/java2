package com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex02 {
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
			conn = DriverManager.getConnection(url, user, password);
			
			// String sql = "select * from member order by idx";
			// idx가 5인 자료 의 모든 정보 출력
			// String sql = "select * from member where idx = ?";
			
			// 로그인 인 경우 id와 패스워드 모두 검사
			String sql = "select * from member where id = ? and pw = ?";
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, "dddd");
			pstm.setString(2, "d111");
			rs = pstm.executeQuery();
			 /*
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getString(5)+"\t");
				System.out.print(rs.getString(6)+"\n");
			}
			*/
			rs.last();
			int total = rs.getRow();
			rs.beforeFirst();
			// 로그인 검사인 경우
			if(total>=1) {
				System.out.println("로그인 성공");
				// 아래 문구 출력 안됨
				/*
				while(rs.next()) {
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\t");
					System.out.print(rs.getString(5)+"\t");
					System.out.print(rs.getString(6)+"\n");
				}
				*/
			}else {
				System.out.println("로그인 실패");
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
