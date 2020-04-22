package com.ict.edu;

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
        int result = 0 ; // insert 결과 받는 변수
		try {
			// 드라이버 로딩
			Class.forName("org.mariadb.jdbc.Driver");
			// 접속정보
			String url = "jdbc:mariadb://203.236.220.55:3306/exam?autoReconnect=true";
			String user = "nohsam";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "insert into member(idx,id,pw,name,age,addr) "+
						 "values(?,?,?,?,?,?)";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, "3");
			pstm.setString(2, "bbbb");
			pstm.setString(3, "2222");
			pstm.setString(4, "홍길동");
			pstm.setString(5, "24");
			pstm.setString(6, "서울");
		   
			result = pstm.executeUpdate();
			
			if(result>=1) {
				System.out.println("삽입 성공");
				sql = "select * from member order by idx";
				pstm = conn.prepareStatement(sql);
				rs = pstm.executeQuery();
				while(rs.next()) {
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\t");
					System.out.print(rs.getString(5)+"\t");
					System.out.print(rs.getString(6)+"\n");
				}
				
			}else {
				System.out.println("삽입 실패");
			}
		} catch (Exception e) {
			System.out.println("삽입 실패2");
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
