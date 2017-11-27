package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countATest {

	@Test
	void test() {
		Sample test = new Sample();
		int output = test.countA("javabean");
		assertEquals(3, output);
	}

}
