package com.ict.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ict.debugging.Ex05;

public class Ex05_Test {
	
	Ex05 test1 ;
	@Before
	public void testBefore() {
		test1 = new Ex05();
	}
	@Test
	public void test() {
		assertEquals(5, test1.div(25, 5));
	}

}
