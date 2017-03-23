import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class Customer_Tester
{
   private Customer testRec = new Customer("stephencurran@gmail.com", "0877718912");
   
   @Test
   public void CheckVailedEmail()
   {
	   testRec.SetEmail("stepehncurran@gmail.com");
	   assertEquals("stepehncurran@gmail.com", testRec.getEmail());
   }
   @Test(expected = IllegalArgumentException.class)
   public void check_for_setting_incorrect_email()
   {
	   testRec.SetEmail("stephencurran_gmail.com");
	   assertEquals("stephencurran_gmail.com",testRec.getEmail());
   }
   @Test(expected = IllegalArgumentException.class)
  public void check_email_contains_dot()
   {
	   testRec.SetEmail("1234567@gmail_com");
	   assertEquals("1234567@gmail_com",testRec.getEmail());
   }
   @Test(expected = IllegalArgumentException.class)
   public void check_email_contains_dot_and_at_symbol()
   {
	   testRec.SetEmail("stephencurran_gmailcom");
	   assertEquals("stephencurran_gmailcom",testRec.getEmail());
   }
   @Test
   public void checkValidPlusPhineNumber()
   {
	testRec.SetPhone(("+353123413"));
	assertEquals("+353123413", testRec.getPhone());
   }
   @Test
   public void CheckValid08PhoneNumber()
   {
	   testRec.SetPhone("0877718912");
	   assertEquals("0877718912", testRec.getPhone());
   }
   @Test(expected = IllegalArgumentException.class)
   public void check_number_contains_plus_or_08()
   {
	   testRec.SetPhone("7712345679"); 
	   assertEquals("7712345679",testRec.getPhone());
   }
   @Test(expected = IllegalArgumentException.class)
   public void check_number_contains_plus()
   {
	   testRec.SetPhone("074 5551234");
	   assertEquals("074 5551234",testRec.getPhone());
   }
   @Test(expected = IllegalArgumentException.class)
   public void check_number_cannot_be_less_that_10()
   {
	   testRec.SetPhone("087123456");
	   assertEquals("087123456",testRec.getPhone());
   }
   @Test(expected = IllegalArgumentException.class)
   public void check_number_cannot_be_more_than_10()
   {
	   testRec.SetPhone("08712345612");
	   assertEquals("08712345612",testRec.getPhone());
   }
   @Test(expected = IllegalArgumentException.class)
   public void check_that_plus_number_cannot_be_more_than_10()
   {
	   testRec.SetPhone("+35312345667");
	   assertEquals("+35312345667",testRec.getPhone());
   }
   @Test(expected = IllegalArgumentException.class)
   public void check_that_plus_number_cannot_be_less_than_10()
   {
	   testRec.SetPhone("+3531234");
	   assertEquals("+3531234",testRec.getPhone());
   }
 
}
