package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SampleTest {

	@Test
	void test() {
		Sample test = new Sample();
		int output = test.square(5);
		assertEquals(25, output);
	}

}
