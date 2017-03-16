import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Customer_Tester
{
   private Customer testRec = new Customer("stephencurran@gmail.com", "0877718912");
   

   @Test
   public void setphoneNumber()
   {
     testRec.SetPhone("+353 49555321");
   }
   @Test
   public void getPhoneNumber()
   {
	   testRec.SetPhone("0877718912");
	   assertEquals("0877718912", testRec.getPhone());
   }
   @Test(expected = IllegalArgumentException.class)
   public void check_for_setting_incorrect_email()
   {
	   testRec.SetEmail("stephencurran_gmail.com");
   }
   @Test(expected = IllegalArgumentException.class)
  public void check_email_contains_letters()
   {
	   testRec.SetEmail("1234567@gmail.com");
   }
   @Test(expected = IllegalArgumentException.class)
  public void check_email_contains_dot()
   {
	   testRec.SetEmail("1234567@gmail_com");
   }
   @Test(expected = IllegalArgumentException.class)
   public void check_number_contains_plus_or_08()
   {
	   testRec.SetPhone("7712345679"); 
   }
   @Test(expected = IllegalArgumentException.class)
   public void check_number_contains_plus()
   {
	   testRec.SetPhone("074 5551234");
   }
}
