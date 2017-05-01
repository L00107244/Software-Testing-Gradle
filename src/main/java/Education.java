/*
 * Name Stephen Curran
 * Student Number: L00107244
 * E-mail L00107244@student.lyit.ie
 */
public class Education 
{
   /*
    * Variables
    */
   private String SchoolName;
   private String SchoolAddress;
   private String County;
   private String Qualification;
   private String CollegeName;
   private String CollegeAddress;
   private String CollegeCounty;
   private String CollQualification;
   /*
    * Validation methods
    */
   public static boolean validate_Entry(String Val_En)
   {
	 return Val_En.matches("[a-zA-záéóíú]+([ '-][a-zA-Z]+)*");
   }
   public static boolean validate_Entry2(String Val_En2)
   {
	 return Val_En2.matches("[a-zA-Z0-9]*");
   }
   /*
    * Constructures
    */
   public Education(String sn, String sa, String coun, String Qual1, String CollName, String CollAdd, String CollCoun, String Qual2)
   {
	   this.SchoolName = sn;
	   this.SchoolAddress = sa;
	   this.County = coun;
	   this.Qualification =  Qual1;
	   this.CollegeName = CollName;
	   this.CollegeAddress = CollAdd;
	   this.CollegeCounty = CollCoun;
	   this.CollQualification = Qual2;
   }
   public Education()
   {
	   
   }
   /*
    * Set methods
    */
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
	   CollegeCounty = CollCountIn;
	   }
	   else
	   {
		   throw new IllegalArgumentException("invalied entry");  
	   }
   }
   
   public void setQualifrication(String SQualIn)
   {
	   if(validate_Entry(SQualIn)==true)
	   {
	   Qualification = SQualIn;
	   }
	   else
	   {
		   throw new IllegalArgumentException("invalied entry");  
	   }
   }
   public void setCollQualifrication(String SQualIn)
   {
	   if(validate_Entry(SQualIn))
	   {
	   CollQualification = SQualIn;
	   }
	   else
	   {
		   throw new IllegalArgumentException("invalied entry");  
	   }
   }
   /*
    * Getter methods
    */
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
   public String geQualifcation()
   {
	   return Qualification;
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
   public String getCollQualification()
   {
	   return CollQualification;
   }


}
