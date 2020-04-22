package com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex04 {
	public static void main(String[] args) {
        Connection conn = null;
        // �������ε��� �̿��� ���� ����
        PreparedStatement pstm = null;
        ResultSet rs = null;
        int result = 0 ; // insert ��� �޴� ����
		try {
			// ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			// ��������
			String url = "jdbc:oracle:thin:@203.236.220.55:1521:xe";
			String user = "hr";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// idx 5�� �ڷ� ����  
			String sql = "delete from member where idx = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, "5");
			result = pstm.executeUpdate();
			
			if(result>=1) {
				System.out.println("���� ����");
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
				System.out.println("��������");
			}
		} catch (Exception e) {
			System.out.println("��������2");
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
