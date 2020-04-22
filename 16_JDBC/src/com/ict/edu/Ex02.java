package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// 1. 자바와 오라클을 연결하기 위한 라이브러리를 프로젝트에 등록하기
//   => 프로젝트에서 마우스 오른쪽 - Build path - configure Build path - Libraries 선택
//      Add External and JARs.. 선택 해서  ojdeb6.jar 파일 존재하는 위치 지정
//      프로젝트에 Referenced Libraries 안에  ojdeb6.jar이 생성
public class Ex02 {
	public static void main(String[] args) {
		// 1. java를 오라클에 접속할 수 있도록 도와주는 클래스
		Connection conn = null;
		// 2. SQL 작성, 구분 생성
		Statement stmt = null;
		// 3. select문을 사용할때 만 사용하는 클래스, 
		//    select의 결과는 항상 테이블(표) 상태이다., 나머지는 숫자로 받으면 된다.
		ResultSet rs = null;
		
		try {
		 // 4. jdbc 드라이버 로딩 : 오라클, MySQL,...  각 DBMS마다  내용이 다르다.
			Class.forName("oracle.jdbc.OracleDriver");
			
		 // 5.오라클 접속 (url,id,pw 정보가 필요하다.)
			String url = "jdbc:oracle:thin:@203.236.220.55:1521:xe";
			String user = "hr";
			String password ="1111";
			
			conn = DriverManager.getConnection(url, user, password);
			
			// 6. SQL 작성
			// employees 테이블에 모든 정보 보기 
			// select * from 테이블명
			// String sql = "select * from employees";
			
			// 원하는 컬럼만 지정해서 보기 
			// select 컬럼명, 컬럼명, 컬럼명  from 테이블이름 ;
			// employee_id, first_name, job_id
			 String sql = "select employee_id, first_name, job_id from employees";
			
			// 7. 오라클에 SQL을 담어서 보낼 준비  => 구분 생성 
			stmt = conn.createStatement();
			
			// 8. 구문 보내고 결과 받기
			// select 일때 
			rs = stmt.executeQuery(sql);
			
			//  select 아니면 => update, delete, insert인 경우 
			// int res = stmt.executeUpdate(sql);
			while (rs.next()) {
				System.out.print(rs.getString("employee_id")+"\t");
				System.out.print(rs.getString("first_name")+"\t");
				System.out.print(rs.getString("job_id")+"\n");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}





