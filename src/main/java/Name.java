import java.util.Scanner;

public class Name
{	
	private String title;
	private String firstName;
	private String surname;
	 public static boolean validate_title1(String Title)
	 {
	   return Title.contains("Mr");
	 }
	 public static boolean validate_title2(String Title1)
	 {
	   return Title1.contains("Miss");
	 }
	 public static boolean validate_title3(String Title1)
	 {
	   return Title1.contains("Dr");
	 }
	 public static boolean validate_firstName(String first_name)
	 {
	   return first_name.contains("[a-zA-z]+([ '-][a-zA-Z]+)*");
	 }
	 public static boolean validate_lastName(String last_name)
	 {
	   return last_name.contains("[a-zA-z]+([ '-][a-zA-Z]+)*");
	 }
	
    public Name()
    {
     this.title= null;
     this.firstName=null;
     this.surname=null;
    }
    public void SetTitle(String t)
    {
    	if( validate_title1(t)|| validate_title2(t) || validate_title3(t))
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
    	if(validate_firstName(fn))
    	{
    	  firstName = fn;
    	}
    	else
    	{
    		throw new IllegalArgumentException("Invalied Name");
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
    	  throw new IllegalArgumentException("Invalied Last Name");
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
}
