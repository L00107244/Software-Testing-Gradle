import java.util.Scanner;

public class Customer 
{
	// INHERITANCE - Customer IS-A Person
		 // Customer has name & phoneNumber from Person

private static final String emailRequirement = "@";
private static final String phoneRequirement1 = "+";
private static final String phoneRequirement2 ="08";
private String emailAddress = null;
private String phoneNumber = null;
private int CustomerID;
private static int ID;




// Default Constructor
// Called when object is created like this ==> 
 protected Customer()
 {
  		// NOTE:Don't need to call super()
  this.emailAddress=null;
  this.phoneNumber=null;
  this.CustomerID = ID++;
 }

// Initialization Constructor
// Called when object is created like this ==>
 protected  Customer(String pNo, String email)
 {
// Call super class constructor - Passing parameters required by Person ONLY!

// And then initialise Customers own instance variables
  this.emailAddress=email;
  this.phoneNumber=pNo;
  this.CustomerID = ID++;
 }
 public static boolean validate_atSymbol_in_email(String email)
 {
   return email.contains("@");
 }
 public static boolean validate_email(String email)
 {
   return email.contains("[a-zA-z]+([ '-][a-zA-Z]+)*");
 }
 public static boolean check_email_has_dot(String email)
 {
   return email.contains(".");
 }
 public static boolean check_phoneNumber_contains_plus(String num)
 {
	 return num.contains("+");
 }
 public static boolean check_phoneNumber_contains_08(String num)
 {
	 return num.contains("08");
 }

 public void SetEmail(String email1)
 {
	 if(validate_email(email1) && validate_atSymbol_in_email(email1) && check_email_has_dot(email1))
	 {
	   emailAddress = email1;
	 }
	 else
	 {
		throw new IllegalArgumentException("invalid email", null); 
	 }
 }
 public void SetPhone(String phone)
 {
	if(check_phoneNumber_contains_plus(phone) || check_phoneNumber_contains_08(phone))
	{
	 phoneNumber = phone;
	}
	else
	{
		throw new IllegalArgumentException("invalid phone number", null);
	}
 }
public String getEmail()
{
	return emailAddress;
}
public String getPhone()
{
	return phoneNumber;
}
}