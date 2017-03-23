import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Name_Tester
{

	private Name testName = new Name("Mr", "John", "smith", 45);
    @Test
    public void checkForValidTitle()
    {
 	   testName.SetTitle("Mr");
 	   assertEquals("Mr", testName.getTitle());
    }
    @Test(expected = IllegalArgumentException.class)
    public void checkForin_ValidTitle()
    {
 	   testName.SetTitle("nr");
 	   assertEquals("nr", testName.getTitle());
    }
    @Test(expected = IllegalArgumentException.class)
    public void check_Title_cannot_contain_numbers()
    {
 	   testName.SetTitle("Mr1234");
 	   assertEquals("Mr1234", testName.getTitle());
    }
    @Test(expected = IllegalArgumentException.class)
    public void check_Title_cannot_be_lowercase()
    {
 	   testName.SetTitle("fr");
 	   assertEquals("fr", testName.getTitle());
    }
    @Test(expected = IllegalArgumentException.class)
    public void check_Title_cannot_be__two_titles()
    {
 	   testName.SetTitle("MrFr");
 	   assertEquals("MrFr", testName.getTitle());
    }
    @Test
    public void check_for_valid_first_name()
    {
 	   testName.SetFirstName("stephen");
 	   assertEquals("stephen", testName.getFirstName());
    }
    @Test
    public void check_for_valid_first_name_with_fada()
    {
 	   testName.SetFirstName("stéphen");
 	   assertEquals("stéphen", testName.getFirstName());
    }
    @Test
    public void check_for_valid_first_name_with_have_a_hypine()
    {
 	   testName.SetFirstName("John-James");
 	   assertEquals("John-James", testName.getFirstName());
    }
    @Test(expected = IllegalArgumentException.class)
    public void check_for_valid_first_name_punctuation()
    {
 	   testName.SetFirstName("John-Ja_mes");
 	   assertEquals("John-Ja_mes", testName.getFirstName());
    }
    @Test(expected = IllegalArgumentException.class)
    public void check_for_first_name_cannot_contain_numbers()
    {
 	   testName.SetFirstName("stéphen1234");
 	   assertEquals("stéphen1234", testName.getFirstName());
    }
    @Test(expected = IllegalArgumentException.class)
    public void check_for_first_name_cannot_contain_symbols()
    {
 	   testName.SetFirstName("'@><?/.()*&^%$£");
 	   assertEquals("'@><?/.()*&^%$£", testName.getFirstName());
    }
    @Test
    public void check_for_valid_surname()
    {
       testName.SetSurname("Curran");
  	   assertEquals("Curran", testName.getSurname());
    }
    @Test
    public void check_for_valid_can_contain_a_hyphne()
    {
       testName.SetSurname("o-Curran");
  	   assertEquals("o-Curran", testName.getSurname());
    }
    @Test(expected = IllegalArgumentException.class)
    public void check_for_valid_can_contain_a_punctuation()
    {
       testName.SetSurname("o-Cur_ran");
  	   assertEquals("o-Cur_ran", testName.getSurname());
    }
    @Test(expected = IllegalArgumentException.class)
    public void check_for_surname_cannot_have_numbers()
    {
       testName.SetSurname("Curran1234");
  	   assertEquals("Curran1234", testName.getSurname());
    }
    @Test
    public void check_for_surname_can_have_apostify()
    {
       testName.SetSurname("O'Curran");
  	   assertEquals("O'Curran", testName.getSurname());
    }
    @Test(expected = IllegalArgumentException.class)
    public void check_for_surname_cannot_have_symbols()
    {
       testName.SetSurname("'@><?/.()*&^%$£");
  	   assertEquals("'@><?/.()*&^%$£", testName.getSurname());
    }
    @Test
    public void check_if_age_is_valid()
    {
    	testName.SetAge(40);
    	assertEquals(40, testName.getAge());
    }
    @Test(expected = IllegalArgumentException.class)
    public void check_if_age_can_be_less_than_0()
    {
    	testName.SetAge(-20);
    }
    @Test(expected = IllegalArgumentException.class)
    public void check_if_age_can_be_a_large_value()
    {
    	testName.SetAge(278);
    }
}
