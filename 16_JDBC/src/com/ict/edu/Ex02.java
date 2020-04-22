package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// 1. �ڹٿ� ����Ŭ�� �����ϱ� ���� ���̺귯���� ������Ʈ�� ����ϱ�
//   => ������Ʈ���� ���콺 ������ - Build path - configure Build path - Libraries ����
//      Add External and JARs.. ���� �ؼ�  ojdeb6.jar ���� �����ϴ� ��ġ ����
//      ������Ʈ�� Referenced Libraries �ȿ�  ojdeb6.jar�� ����
public class Ex02 {
	public static void main(String[] args) {
		// 1. java�� ����Ŭ�� ������ �� �ֵ��� �����ִ� Ŭ����
		Connection conn = null;
		// 2. SQL �ۼ�, ���� ����
		Statement stmt = null;
		// 3. select���� ����Ҷ� �� ����ϴ� Ŭ����, 
		//    select�� ����� �׻� ���̺�(ǥ) �����̴�., �������� ���ڷ� ������ �ȴ�.
		ResultSet rs = null;
		
		try {
		 // 4. jdbc ����̹� �ε� : ����Ŭ, MySQL,...  �� DBMS����  ������ �ٸ���.
			Class.forName("oracle.jdbc.OracleDriver");
			
		 // 5.����Ŭ ���� (url,id,pw ������ �ʿ��ϴ�.)
			String url = "jdbc:oracle:thin:@203.236.220.55:1521:xe";
			String user = "hr";
			String password ="1111";
			
			conn = DriverManager.getConnection(url, user, password);
			
			// 6. SQL �ۼ�
			// employees ���̺� ��� ���� ���� 
			// select * from ���̺��
			// String sql = "select * from employees";
			
			// ���ϴ� �÷��� �����ؼ� ���� 
			// select �÷���, �÷���, �÷���  from ���̺��̸� ;
			// employee_id, first_name, job_id
			 String sql = "select employee_id, first_name, job_id from employees";
			
			// 7. ����Ŭ�� SQL�� �� ���� �غ�  => ���� ���� 
			stmt = conn.createStatement();
			
			// 8. ���� ������ ��� �ޱ�
			// select �϶� 
			rs = stmt.executeQuery(sql);
			
			//  select �ƴϸ� => update, delete, insert�� ��� 
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





