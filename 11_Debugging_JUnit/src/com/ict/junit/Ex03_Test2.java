package com.ict.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ict.debugging.Ex03;

@RunWith(Parameterized.class)
public class Ex03_Test2 {
	Ex03 test;
	
	private int expected ; // ����
	private int valueA ;   // �Է°�1
	private int valueB ;   // �Է°�2
	
	// ������
	public Ex03_Test2(int expected, int valueA, int valueB) {
		super();
		this.expected = expected;
		this.valueA = valueA;
		this.valueB = valueB;
	}
	
	@Before
	public void testBefore() {
		test = new Ex03();
	}
	
	// �׽�Ʈ ���̽����� �迭 �־���.
	@Parameters
	public static Collection<Integer[]> getTestParameters(){
		return Arrays.asList(new Integer[][] {
			{5,3,2},
			{-4,-3,-1},
			{5,-3, 8},
			{5,8,-3}
		});
	}
	@Test
	public void test() {
		assertEquals(expected, test.add(valueA, valueB));
	}

}
