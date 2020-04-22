package com.ict.edu;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Ex07 {
	public static void main(String[] args) {
		try {
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("Company");
			doc.appendChild(rootElement);
			// staff ������Ʈ
			Element staff = doc.createElement("Staff");
			rootElement.appendChild(staff);

			// �Ӽ��� ����
			Attr attr = doc.createAttribute("id");
			attr.setValue("1");
			staff.setAttributeNode(attr);

			// �Ӽ����� �����ϴ� �� ���� ���
			// staff.setAttribute(��id��, ��1��);

			// firstname ������Ʈ
			Element firstname = doc.createElement("firstname");
			firstname.appendChild(doc.createTextNode("Gildong"));
			staff.appendChild(firstname);

			// lastname ������Ʈ
			Element lastname = doc.createElement("lastname");
			lastname.appendChild(doc.createTextNode("Hong"));
			staff.appendChild(lastname);

			// nickname ������Ʈ
			Element nickname = doc.createElement("nickname");
			nickname.appendChild(doc.createTextNode("Mr.Hong"));
			staff.appendChild(nickname);

			// salary ������Ʈ
			Element salary = doc.createElement("salary");
			salary.appendChild(doc.createTextNode("100000"));
			staff.appendChild(salary);

			// XML ���Ϸ� ����
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();

			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");	
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new FileOutputStream(new File("C:\\study\\util\\file.xml")));

			// ���Ϸ� ���� �ʰ� �ֿܼ� ���� ���� ��� ������ ��� (������)
			// StreamResult result = new StreamResult(System.out);

			transformer.transform(source, result);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
