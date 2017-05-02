import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.StringStartsWith.startsWith;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class eircode_tester 
{
	 private eircode testCode = new eircode("K65AS23");
	 //testCode = new eircode("F54TY56");
   @Test
   public void Test_for_valied_eircode()
   {
	   assertThat(testCode.getEircode(), is(equalTo("K65AS23")));
   }
   @Rule
 	public ExpectedException thrown = ExpectedException.none();
   @Test
   public void Test_if_code_is_to_short()
   {
	   thrown.expect(IllegalArgumentException.class);
	   final eircode codeToShort = new eircode("F54TY5");
   }
   @Test
   public void Test_if_code_is_to_long()
   {
	   thrown.expect(IllegalArgumentException.class);
	   final eircode codeToLong = new eircode("F54TY564567");
   }
   @Test
   public void Test_if_code_cannot_contain_only_Letters()
   {
	   thrown.expect(IllegalArgumentException.class);
	   final eircode codeToconnotContainLettersOnly = new eircode("FTGDWER");
   }
   @Test
   public void Test_if_code_cannot_contain_only_numbers()
   {
	   thrown.expect(IllegalArgumentException.class);
	   final eircode codeCannotContainOnlyNumbers = new eircode("8974582");
   }
}
