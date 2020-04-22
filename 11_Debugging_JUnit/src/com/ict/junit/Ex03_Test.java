package com.ict.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.debugging.Ex03;

// JUnit : ���� �׽�Ʈ ����, ��Ŭ�������� �⺻���� ����  
// ���ڽ� �׽�Ʈ : �Է°��� �־ ������ ������ ����, ������ ������ ����
// assertEquals : �⺻�� ���� �Ǵ� (��ü�� ��) �� ���� ���� ������ �˻��Ѵ�.
// assertSame : �� ��ü�� ���� ��ü���� �˻� (�ּҰ� ����?)
// assertNull : ��ü�� null ���� �˻�
// assertNotNull : ��ü�� null�� �ƴ��� �˻� �Ѵ�.
// assertTrue(a) : a �� ������ Ȯ��
// assertArrayEquals(a,b) : �迭 a, �迭b�� ��ġ���� Ȯ��
public class Ex03_Test {
	Ex03 t1;

	@Before
	public void testBefore() {
		System.out.println("����");
		t1 = new Ex03();
	}
	// ���� �׽�Ʈ �ϴ� �޼ҵ�
	@Test
	public void test() {
		int result = t1.add(10, 20);
		assertEquals(30, result);

	}
	@Test
	public void test2() {
		int result = t1.sub(10, 20);
		assertEquals(-10, result);

	}
	
	@After
	public void testAfter() {
		System.out.println("���� �ϼ̽��ϴ�.");
	}
}
