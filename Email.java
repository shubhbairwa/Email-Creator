package EmailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private int mailboxCapacity=100;
	private int defaultPasswordLength=10;
	private String password;
	private String email;
	private String alternateEmail;
	private String companysuffix="anycompany.com";

//constructor to receive first name and last name
	public Email(String firstName,String Lastname) {
		this.firstName=firstName;
		this.lastName=Lastname;
		System.out.println("EMAIL IS CREATED FOR THIS NAME: "+firstName+" "+Lastname);
	//creating a method for department setup.It return department 
		this.department=setDepartment();
		//System.out.println("DEPARTMENTS is: "+this.department);
		System.out.println();
		System.out.println("WLECOME "+firstName+" "+lastName);
	// calling a method that return random password
	this.password=randomPassword(defaultPasswordLength);
	//System.out.println("your Deafult password is: "+this.password);
	email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"."+department+"@"+companysuffix;
	//System.out.println("YOUR EMAIL ID IS: "+email);
	
	}
	//ask for department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES ARE:\n1 for Sales\n2 for Development\n3 for Account\n0 for None\n Choose your Department: ");
		Scanner sc=new Scanner(System.in);
		int DepChoice=sc.nextInt();
		if(DepChoice==1) {return "Sales";}
		else if(DepChoice==2) {return "dev";}
		else if(DepChoice==3) {return "acct";}
		else if(DepChoice==0) {return "None";}
		else {return "";}
		}
		
		
	//generate a random password
private	String randomPassword(int length){
String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$";
char[]password=new char[length];
for (int i = 0; i < password.length; i++) {
	int rand=(int) (Math.random()*passwordSet.length());
password[i]=passwordSet.charAt(rand);	
}
return new String(password); //new string because we create character so for implement we have to create new string.

}
	

		
		
		
	//set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	//set alternate email id
	public void setAlternateEmail(String altemail) {
		this.alternateEmail=altemail;
	}
	//change the password
public void setPassword(String password) {
	this.password=password;
}
public String getPassword() {
	return password;
}



public int getMailboxCapacity() {
	return mailboxCapacity;
}



public String getAlternateEmail() {
	return alternateEmail;
}
public String showInfo() {
return "\nName: "+firstName+" "+lastName+
"\nDepartment Name: "+department+"\n Email id: "+email+"\nYOUR DEFAULT PASSWORD IS: "+this.password+
"\nMailBox Capacity: "+mailboxCapacity+"mb";
}
}

