package com.ict.edu;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Ex08 {
	public static void main(String[] args) {
		JSONObject obj = new JSONObject();
		obj.put("�̸�","��ġ");
		obj.put("������","����");
		
		String data = obj.toString();
		System.out.println(data);
		
		String data2 = (String) obj.get("�̸�");
        System.out.println(data2);
        
     //////////////////////////////////////
     // �߰�ȣ�� �� �Ӽ� ���� { "a" : "1", "b" : "2" }
        JSONObject jsonObject1 = new JSONObject(); 
     // ���ȣ ���� [{ "a" : "1", "b" : "2" }]
        JSONArray jsonArray1 = new JSONArray();
     // �߰�ȣ�� ���� ���ȣ�� �̸��� ������ { "c" : [{  "a" : "1", "b" : "2" }] }
        JSONObject finalJsonObject1 = new JSONObject(); 
 
        jsonObject1.put("�̸�", "���ڸ�");
        jsonObject1.put("�ٸ�����", "6");
        jsonArray1.add(jsonObject1);
 
        jsonObject1 = new JSONObject();
        jsonObject1.put("�̸�", "�罿����");
        jsonObject1.put("�ٸ�����", "6");
        jsonArray1.add(jsonObject1);
        
        finalJsonObject1.put("����", jsonArray1);
 
        finalJsonObject1.put("����", "�ڳ���");
        finalJsonObject1.put("�Ĺ�", "����ȭ");
        
        System.out.println(finalJsonObject1);

	}
}
