package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String departments;
	private int mailboxCapacity = 500;
	private int defaultpasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "abccompany.com";
	
//	Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName );
		
//	call a method asking for the departments
		this.departments = setDepartment();
		System.out.println("Department: "+ this.departments);
		
//		call a method that creates random password
		this.password = randomPassword(defaultpasswordLength);
		System.out.println("Your password is: "+ this.password);
	
//	Combine elements to generate emails
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + departments +"."+ companySuffix;
		System.out.println("Your email is: "+ email);
	
		
	}
	
//	Ask for the department
	private String setDepartment() {
		 System.out.print("DEPARTMENT CODES:\n 1 for Sales\n 2 for Development\n 3 for Accounting\n Enter the department codes:");
		 Scanner scanner = new Scanner(System.in);
		 int depChoice = scanner.nextInt();
		 
		 if(depChoice == 1) {
			 return "sales";
		 }
		 else if (depChoice == 2) {
			 return "dev";
		 }
		 else if (depChoice ==3) {
			 return "acct";
		 }
		 else {
			 return "";
		 }
	}
	
//	Generate a random password
	public String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPKRSTUVWSWZ!@#$%~";
		char[] password = new char[length];  // create random pass by choose random characters among an array above
		for (int i=0;i<length;i++) {   // create the values of length, 
//	have 30 values above, "Math.random" is 0 and 1, multiples by the length of array and 
//	make it an Integer and stores it in "ran"
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);  	
		}
//	Because pasword is an Int, so need to change it to a String
		return new String(password);
		
	}
	
//	Pure of OOP 
//	Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
//	Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
//	change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity (){
		return mailboxCapacity; 
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName +" "+ lastName +"\n"
				+ "COMPANY EMAIL: " + email+"\n" +
				"MAILBOX CAPACITY: " + mailboxCapacity + "mb";	
	}
}
