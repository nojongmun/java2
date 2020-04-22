package com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex03 {
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
			
			String sql = "insert into member(idx,id,pw,name,age,addr) "+
						 "values(?,?,?,?,?,?)";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, "1");
			pstm.setString(2, "aaaa");
			pstm.setString(3, "1111");
			pstm.setString(4, "ȫ�浿");
			pstm.setString(5, "24");
			pstm.setString(6, "����");
		   
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
				System.out.println("���� ����");
			}
		} catch (Exception e) {
			System.out.println("���� ����2");
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
