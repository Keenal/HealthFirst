package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import users.User;

public class UserTest {
	// create an object of User class
	User user = new User();

	// test user name
	@Test
	public void testSetName() {
		user.setName("test");
		assertEquals("name", "test", User.getName());		
	}
	
	// test patient id
	@Test
	public void testSetPid() {	
		User.setPid(1);
		assertEquals("pid", 1, User.getPid());	
	}
	
	// test toString method
	@Test
	public void test_toString_returnsUserName() {	
		String result = user.toString();
		assertTrue(result.contains("User [name = " + User.getName() + "]"));	
	}
}
