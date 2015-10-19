package assignment2;

import java.util.Date;

import lombok.Data;

@Data
public class Employee {

	private int employeeId;
	private String employeeName;
	private String employeeEmail;
	private Date dateOfBirth;
	private Date dateOfJoining;
	private int ctcPerAnnum;
}
