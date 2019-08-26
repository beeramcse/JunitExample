package com.junit.JunitExample;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {
	App a=new App();

	@Test
	public void test() {
		
		assertEquals(false, a.isaux());
	}
	
	@Test
	public void test2() {

		assertEquals(false, a.isaux());

	}

}
