import org.testng.Assert;
import org.testng.annotations.Test;
public class Education_Tester
{
  Education edu = new Education();
  
  @Test
  public void testCalculateAppriasal()
  {
     edu.setSchoolName("Tech school");
     edu.setSchoolAddress("drunowna drung");
     edu.setCounty("cavan");
     edu.setCollegeName("LYIT");
     edu.setCollegeAddress("port rd letterkenny");
     edu.setCollegeCoutny("Donegal");
     Assert.assertEquals("Tech school", "drunowna drung");
  }
}

