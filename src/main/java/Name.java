import java.util.Scanner;

public class Name
{	
	private static final int MinAge=0;
    private static final int MaxAge=100;
	private String title;
	private String firstName;
	private String surname;
	private int Age;
	 public static boolean validate_title1(String Title)
	 {
	   return Title.equals("Mr");
	   
	 }
	 public static boolean validate_title2(String Title1)
	 {
	   return Title1.equals("Miss");
	 }
	 public static boolean validate_title3(String Title1)
	 {
	   return Title1.equals("Dr");
	 }
	 public static boolean validate_title4(String Title1)
	 {
	   return Title1.equals("Fr");
	 }
	 public static boolean validate_firstName(String first_name)
	 {
	   return first_name.matches("[a-zA-záéóíú]+([ '-][a-zA-Z]+)*");
	 }
	 public static boolean validate_lastName(String last_name)
	 {
	   return last_name.matches("[a-zA-záéóíú]+([ '-][a-zA-Z]+)*");
	 }

	
     public Name(String titleIn, String Fn, String Sn, int A)
     {
      this.title= titleIn;
      this.firstName=Fn;
      this.surname=Sn;
      this.Age = A;
     }
     public void SetTitle(String t)
     {
     	if( validate_title1(t) || validate_title2(t) || validate_title3(t)==true)
    	{
    	title = t;
    	}
    	else
    	{
    		throw new IllegalArgumentException("invalied Title");
    	}
     }
     public void SetFirstName(String fn)
     {
    	if(validate_firstName(fn)==true)
    	{
    	  this.firstName = fn;
    	}
    	else
    	{
    		throw new IllegalArgumentException("Invalied Name",null);
    	}
     }
     public void SetSurname(String sur)
     {
      if(validate_lastName(sur))
      {
    	surname = sur;
      }
      else
      {
    	  throw new IllegalArgumentException("Invalied Last Name",null);
      }
     }
     public void SetAge(int AgeIn)
     {
       if(AgeIn < MinAge || AgeIn > MaxAge)
       {
    	   throw new IllegalArgumentException("Invalied Age",null);    	 
       }
       else
       {
    	   this.Age = AgeIn;  
       }
     }
     public String getTitle()
     {
    	return title;
     }
     public String getFirstName()
     {
    	return firstName;
     }
     public String getSurname()
     {
    	return surname;
     }
     public int getAge()
     {
    	return Age;
     }
}
