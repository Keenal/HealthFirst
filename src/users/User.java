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
	
	/**
	 * Default constructor for the User class
	 */
	public User() {
	} // end of default constructor
	
	/**
	 * parameterized constructor for the User class
	 */
	public User(String name) {
		this.name = name;
	} // end of parameterized constructor
	
	/**
	 * @return the String name
	 */
	public static String getName() {
		return name;
	}
	
	/**
	 * @param name = the name to set
	 */
	public void setName(String name) {
		User.name = name;
	}
	
	/**
	 * @return the int pid = patient identification number
	 */
	public static int getPid() {
		return pid;
	}
	
	/**
	 * @param pid = the patient identification number
	 */
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
