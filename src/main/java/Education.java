public class Education 
{
   private String SchoolName;
   private String SchoolAddress;
   private String County;
   private String CollegeName;
   private String CollegeAddress;
   private String CollegeCounty;
   
   public static boolean validate_Entry(String Val_En)
   {
	 return Val_En.matches("[a-zA-záéóíú]+([ '-][a-zA-Z]+)*");
   }
   public Education(String sn, String sa, String coun, String CollName, String CollAdd, String CollCoun)
   {
	   this.SchoolName = sn;
	   this.SchoolAddress = sa;
	   this.County = coun;
	   this.CollegeName = CollName;
	   this.CollegeAddress = CollAdd;
	   this.CollegeCounty = CollCoun;
   }
   public Education()
   {
	   
   }
   public void setSchoolName(String schoolNameIn)
   {
	  if(validate_Entry(schoolNameIn)==true)
   	  {
	   SchoolName = schoolNameIn;
   	  }
	  else
	  {
		  throw new IllegalArgumentException("invalied entry");
	  }
   }
   public void setSchoolAddress(String schoolAddressIn)
   {
	   if(validate_Entry(schoolAddressIn)==true)
	   {
	   SchoolAddress = schoolAddressIn;
	   }
	   else
	   {
		   throw new IllegalArgumentException("invalied entry");
	   }
   }
   public void setCounty(String CountyIn)
   {
	   if(validate_Entry(CountyIn)==true)
	   {
	   County = CountyIn;
	   }
	   else
	   {
		   throw new IllegalArgumentException("invalied entry"); 
	   }
   }
   public void setCollegeName(String CollNameIn)
   {
	   if(validate_Entry(CollNameIn)==true)
	   {
	   CollegeName = CollNameIn;
	   }
	   else
	   {
		   throw new IllegalArgumentException("invalied entry");  
	   }
   }
   public void setCollegeAddress(String CollAddIn)
   {
	   if(validate_Entry(CollAddIn)==true)
	   {
	   CollegeAddress = CollAddIn;
	   }
	   else
	   {
		   throw new IllegalArgumentException("invalied entry");   
	   }
   }
   public void setCollegeCoutny(String CollCountIn)
   {
	   if(validate_Entry(CollCountIn)==true)
	   {
	   CollegeAddress = CollCountIn;
	   }
	   else
	   {
		   throw new IllegalArgumentException("invalied entry");  
	   }
   }
   public String getSchoolName()
   {
	   return SchoolName;
   }
   public String getSchoolAddress()
   {
	   return SchoolAddress;
   }
   public String getSchoolCounty()
   {
	   return County;
   }
   public String getCollegeName()
   {
	   return CollegeName;
   }
   public String getCollegeAddress()
   {
	   return CollegeAddress;
   }
   public String getCollegeCounty()
   {
	   return CollegeCounty;
   }

}
