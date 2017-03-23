public class Customer 
{

private String emailAddress = null;
private String phoneNumber = null;
private int CustomerID;
private static int ID;

 protected Customer()
 {
  this.emailAddress=null;
  this.phoneNumber=null;
  this.CustomerID = ID++;
 }

 protected  Customer(String pNo, String email)
 {

  this.emailAddress=email;
  this.phoneNumber=pNo;
  this.CustomerID = ID++;
 }

 public static boolean validate_atSymbol_in_email(String email)
 {
   
       return email.contains("@");
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
	 if(validate_atSymbol_in_email(email1) && check_email_has_dot(email1)==true)
	 {
	  this.emailAddress = email1;
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
		if(phone.length() < 10)
		  {
			  throw new IllegalArgumentException("phone number to short: "+phone);
		  }
		  if(phone.length() > 10)
		  {
			  throw new IllegalArgumentException("phone number to long: "+phone);
		  }
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