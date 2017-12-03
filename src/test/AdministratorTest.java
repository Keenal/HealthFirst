package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import users.Administrator; 
class AdministratorTest {
	
	Administrator administrator =  new Administrator();
	/**
	@Test
	void test() {
		fail("Not yet implemented");
	}
	*/
	// test toString method
	@Test
	public void test_toString_returnsAdministratorName() {
		
		String result = administrator.toString();
		assertTrue(result.contains("Administrator [name = " + administrator.getName() + "]"));
			
	}
}