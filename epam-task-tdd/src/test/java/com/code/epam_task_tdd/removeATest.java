package com.code.epam_task_tdd;
import static org.junit.Assert.*;
import org.junit.Test;

public class removeATest {
	removeA removea=new removeA();
	@Test
	public void testFirstA() {
		assertEquals("BCD",removea.removeA("ABCD"));
	}
	@Test
	public void test2As(){
		assertEquals("CD",removea.removeA("AACD"));
	}
	@Test
	public void testSecondA(){
		assertEquals("BCD",removea.removeA("BACD"));
	}
	@Test
	public void testNoAs(){
		assertEquals("BBAA",removea.removeA("BBAA"));
	}
	@Test
	public void testOneA(){
		assertEquals("",removea.removeA("A"));
	}
	@Test
	public void testEmpty(){
		assertEquals("",removea.removeA(""));
	}
	@Test
	public void test(){
		assertEquals("BBAA",removea.removeA("AABBAA"));
	}
}
