import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.StringStartsWith.startsWith;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Education_Tester
{
  Education edu = new Education();
  @Test
  public void Test_for_valied_scool_name()
  {
	  edu.setSchoolName("Tech School"); 
	  assertThat(edu.getSchoolName(), is(equalTo("Tech School")));
  }
  @Rule
	public ExpectedException thrown = ExpectedException.none();
  @Test
  public void Test_for_valied_scool_address()
  {
	  edu.setSchoolAddress("Drumowna Drung");
	  assertThat(edu.getSchoolAddress(), is(equalTo("Drumowna Drung")));
  }
  @Test
  public void Test_for_valied_scool_County()
  {
	  edu.setCounty("Cavan");
	  assertThat(edu.getSchoolCounty(), is(equalTo("Cavan")));
  }
  @Test
  public void Test_for_valied_scool_Qualification()
  {
	  edu.setQualifrication("Leaving Cert");
	  assertThat(edu.geQualifcation(), is(equalTo("Leaving Cert")));
  }
  @Test
  public void Test_for_valied_College_name()
  {
	  edu.setCollegeName("Lettkenny institute of techology");
	  assertThat(edu.getCollegeName(), is(equalTo("Lettkenny institute of techology")));
  }
  @Test
  public void Test_for_valied_College_Address()
  {
	  edu.setCollegeAddress("portrd letterkenny");
	  assertThat(edu.getCollegeAddress(), is(equalTo("portrd letterkenny")));
  }
  @Test
  public void Test_for_valied_College_County()
  {
	  edu.setCollegeCoutny("Donegal");
	  assertThat(edu.getCollegeCounty(), is(equalTo("Donegal")));
  }
  @Test
  public void Test_for_valied_College_Qualification()
  {
	  edu.setCollegeCoutny("Degree");
	  assertThat(edu.getCollegeCounty(), is(equalTo("Degree")));
  }
  @Test
  public void Test_if_code_is_to_school_name_cannot_be_numbers()
  {
	   thrown.expect(IllegalArgumentException.class);
	   edu.setSchoolName("12345");
	   assertThat(edu.getSchoolName(), is(equalTo("12345")));
	
  }
  @Test
  public void Test_if_code_is_to_college_name_cannot_be_numbers()
  {
	   thrown.expect(IllegalArgumentException.class);
	   edu.setCollegeName("12345");
	   assertThat(edu.getCollegeName(), is(equalTo("12345")));
	
  }
 /* @Test
  public void check_college_degree_can_contain_numbers()
  {
	   //thrown.expect(IllegalArgumentException.class);
	   edu.setCollQualifrication("1.1 Honours");
	   assertThat(edu.getCollQualification(), is(equalTo("1.1 Honours")));
	
  }
 @Test
  public void check_school_address_can_contain_numbers()
  {
	   //thrown.expect(IllegalArgumentException.class);
	   edu.setSchoolAddress("12 ballyraine");
	   assertThat(edu.getSchoolAddress(), is(equalTo("12 ballyraine")));
	
  }*/
  /*@Test
  public void check_college_address_can_contain_numbers()
  {
	   //thrown.expect(IllegalArgumentException.class);
	   edu.setCollegeAddress("Shellbridge D3");
	   assertThat(edu.getCollegeAddress(), is(equalTo("Shellbridge D3")));
	
  }*/

  

}

