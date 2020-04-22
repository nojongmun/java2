package com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex02 {
	public static void main(String[] args) {
        Connection conn = null;
        // �������ε��� �̿��� ���� ����
        PreparedStatement pstm = null;
        ResultSet rs = null;
		try {
			// ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			// ��������
			String url = "jdbc:oracle:thin:@203.236.220.55:1521:xe";
			String user = "hr";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// String sql = "select * from member order by idx";
			// idx�� 5�� �ڷ� �� ��� ���� ���
			// String sql = "select * from member where idx = ?";
			
			// �α��� �� ��� id�� �н����� ��� �˻�
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
			// �α��� �˻��� ���
			if(total>=1) {
				System.out.println("�α��� ����");
				// �Ʒ� ���� ��� �ȵ�
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
				System.out.println("�α��� ����");
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
