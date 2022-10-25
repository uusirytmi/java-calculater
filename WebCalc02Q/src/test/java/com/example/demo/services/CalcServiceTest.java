package com.example.demo.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcServiceTest {

	CalcService service = new CalcService();

	@Test
	void testcalculateAdd() {
		String actual = service.calculateAdd("3", "1");
		assertEquals("4", actual);
	}

	@Test
	void testcalculateSubtract() {
		String actual = service.calculateSubtract("4", "1");
		assertEquals("3", actual);
	}

	@Test
	void testcalculateMultiply() {
		String actual = service.calculateMultiply("3", "1");
		assertEquals("3", actual);
	}

	@Test
	void testcalculateDivide() {
		String actual = service.calculateDivide("6.0000000", "2.0000000");
		assertEquals("3.0000000", actual);
	}
	
	@Test
	void testcalculateAdderror() {
		String actual = service.calculateAdd("a", "1");
		assertEquals("数字以外の文字列が入っています。もう一度入力してください。", actual);
		
		
	}

	@Test
	void testcalculateSubtracterror() {
		String actual = service.calculateSubtract("a", "1");
		assertEquals("数字以外の文字列が入っています。もう一度入力してください。", actual);
	}

	@Test
	void testcalculateMultiplyerror() {
		String actual = service.calculateMultiply("d", "1");
		assertEquals("数字以外の文字列が入っています。もう一度入力してください。", actual);
	}

	@Test
	void testcalculateDivideerror() {
		String actual = service.calculateDivide(";", "2.0000000");
		assertEquals("数字以外の文字列が入っています。もう一度入力してください。", actual);
	}
}