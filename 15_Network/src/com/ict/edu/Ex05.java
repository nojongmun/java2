package com.ict.edu;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

// �Ľ� ; ������ ���ϴ� ���·� �����ϴ� ����
public class Ex05 {
	public static void main(String[] args) {
		  BufferedReader br = null;
		  
		  
		  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		  DocumentBuilder builder = null;
		  Document document = null;
		try {
		   // ���������� �����ϴ� ����Ʈ : https://www.data.go.kr
		   URL url = new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml");
		   URLConnection conn = url.openConnection();
		   br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
		   String msg = null;
		   StringBuffer sb = new StringBuffer();
		   while ((msg = br.readLine())!= null) {
			  sb.append(msg+"\n");
		  }
		   System.out.println(sb.toString());
		   
		   // ������ �б�
		   InputSource is = new InputSource(new StringReader(sb.toString()));
		   builder =  factory.newDocumentBuilder();
		   document = builder.parse(is);
		   
		   // �±� ���ϱ�
		   NodeList local = document.getElementsByTagName("local");
		   StringBuilder sb2 = new StringBuilder();
		   for (int i = 0; i < local.getLength(); i++) {
			   // �±� �ؽ�Ʈ ���ϱ�
			   sb2.append( local.item(i).getFirstChild().getNodeValue()+ ",    ");
			   
			   // �±� �Ӽ� ��������
			   sb2.append(((Element)local.item(i)).getAttribute("desc")+",   " );
			   sb2.append(((Element)local.item(i)).getAttribute("ta")+"\n" );
		   }
		   System.out.println(sb2.toString());
		} catch (Exception e) {
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
			}
		}
	}
}
