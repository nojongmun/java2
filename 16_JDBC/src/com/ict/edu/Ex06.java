package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex06 {
	public static void main(String[] args) {
        Connection conn = null ;
        Statement stmt = null;
        // 원래 select문에서만 ReuseltSet 사용
        ResultSet rs = null;
        // select를 제외한 나머지 문에서는 int를 사용
        int result = 0 ;
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			// 접속
			String url = "jdbc:oracle:thin:@203.236.220.55:1521:xe";
			String user = "hr";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			// sql문
			// idx 5 인 사람의 나이는 24살, 주소는 남극으로 변경하자
			// String sql = "update member set age=24, addr='남극' where idx =5";
			
			// 이름 마이콜인 사람의 주소를 경기도로 변경하자
			String sql = "update member set addr='경기도' where name = '마이콜'";
			// 구문생성
			stmt = conn.createStatement();
			
			// select문인 경우 
			//  rs = stmt.executeQuery(sql);
			// select문을 제외한 경우
			result = stmt.executeUpdate(sql);
			if(result>0) {
				System.out.println("삭제성공");
				sql = "select * from member order by idx";
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\t");
					System.out.print(rs.getString(5)+"\t");
					System.out.print(rs.getString(6)+"\n");
				}
			}else {
				System.out.println("조건에 맞는 자료가 없어서 삭제실패");
			}
		} catch (Exception e) {
			System.out.println("삭제실패2");
		} finally {
			try {
			  stmt.close();
			  conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
