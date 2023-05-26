package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private String alternateEmail;
	private int mailboxCapacity = 500;
	private int defaultpasswordlength = 10;
	private String companySuffix = "xyzcompany.com"; 
	
	//Constructor for receiving the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email Created: " + this.firstName + " " + this.lastName);
	
	
	//Call a method asking for department
	this.department = setDepartment();
	//System.out.println("Department is: " + this.department);
	
	//Call a method that returns a random password
	this.password = randomPassword(defaultpasswordlength); 
	System.out.println("Your password is: " + this.password);
	
	//combine elements to generate email
	email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + "." + companySuffix;	
	System.out.println("Your Email id is: " + this.email);
	
	}
	//Ask for department
	
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	

	/**
	 * @return the alternateEmail
	 */
	public String getAlternateEmail() {
		return alternateEmail;
	}

	/**
	 * @return the mailboxCapacity
	 */
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	private String setDepartment() {
		System.out.print("Enter the department code\n1 for Sales\n2 for development\n3 for accounting\n0 for none");
		System.out.println("enter value: ");
		Scanner sc = new Scanner(System.in);
		int depChoice = sc.nextInt();
		
		if(depChoice == 1) {return "sales";}
	    else if(depChoice == 2) {return "dev";}
	    else if(depChoice == 3) {return "acct";}
	    else {return "";}
		}
	
	
	//generate a random password
	
	private String randomPassword(int length) { 
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}
	
	//Set the mailbox capacity
	
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//change the password
	
	public void ChangePassword(String password) {
		this.password = password;
	}
	
	public String showInfo() {
		return "Display Name: " + firstName + " " + lastName +
				"\nCompany Email: " + email + 
				"\nMailbox Capacity: " + mailboxCapacity + "mb";
	}
	
}
