package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import users.User;

public class UserTest {

	User user = new User();

	
	@Test
	public void testSetName() {
		user.setName("test");
		assertEquals("name", "test", user.getName());
	}
	
	@Test
	public void testSetPid() {
		user.setPid(1);
		assertEquals("pid", 1, user.getPid());
		
	}
	
	/*
	@Test
	public void test_toString_returnsUserName() {
		String result = "User [name =" +  + "]";
		assertEquals(user.toString(), result);
	}
	*/
	
	

}
