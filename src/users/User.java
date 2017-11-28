package users;

/**
This program:
HealthFirst allows doctors, nurses, and pharmacists to prescribe, review, distribute, 
and track patient medications simultaneously. This would reduce the confusion that might 
come from the use of paper records/logs, and reduce the risk of potential over/under 
dosage and conflicts with other medications.


@author Timothy McWatters
@author Keenal Shah
@author Chris Ault
@author Jimmy Le

@version 1.0

CEN3031    "HealthFirst" SE1-Afternoon Group 1's class project
File Name: User.java
*/

public class User {

	static String name = "";
	static int pid = 0;
	
	// default constructor
	public User() {
		
	}
	
	// parameterized constructor
	
	public User(String name) {
		this.name = name;
	}
	
	// getters and setters
	
	public static String getName() {
		return name;
	}
	
	public static int getPid() {
		return pid;
	}
	
	public void setName(String name) {
		User.name = name;
	}
	
	public static void setPid(int pid) {
		User.pid = pid;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [name = " + getName() + "]";
	}
	
} // end of User class
