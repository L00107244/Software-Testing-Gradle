/*
 * Name Stephen Curran
 * Student Number: L00107244
 * E-mail L00107244@student.lyit.ie
 */
public class eircode
{
	/*
	 * Variables
	 */
  private String eirCode  = null;
  private String CanidateEirCode = null;
  /*
   * Consturter with validation
   */
  public eircode(String eir)
  {
	  super();
	  CanidateEirCode = generateCanEircode(eir);
	  
	  if(CanidateEirCode.length() < 7)
	  {
		  throw new IllegalArgumentException("eircode to short: "+CanidateEirCode);
	  }
	  if(CanidateEirCode.length() > 7)
	  {
		  throw new IllegalArgumentException("eircode to long: "+CanidateEirCode);
	  }
	  if (CanidateEirCode.matches("[a-zA-Z]+") )
	  {
		  throw new IllegalArgumentException("eircode must contain letters and numbers: "+CanidateEirCode);
	  }
	  if (CanidateEirCode.matches("[0-9]+") )
	  {
		  throw new IllegalArgumentException("eircode must contain Letters and numbers: "+CanidateEirCode); 
	  }
	  this.eirCode=CanidateEirCode;
  }
  //to string method
  @Override
  public String toString()
  {
	  return "eircode [eircode="+eirCode+"]";
  }
  //produce eir code
  private String generateCanEircode(String nonCanEircode)
  {
	  String CanEircode = nonCanEircode.replaceAll("\\s+","");
	  CanEircode = CanEircode.toUpperCase();
	  return CanEircode;
  }
  @Override
  public int hashCode()
  {
	  final int prime = 31;
	  int result = 1;
	  result = prime * result + ((eirCode == null) ? 0: eirCode.hashCode());
	  return result;
  }
  @Override
  public boolean equals(Object obj)
  {
	  if(this == obj)
	  {
		  return true;
	  }
	  if(obj == null)
	  {
		  return false;
	  }
	  eircode other = (eircode) obj;
	  if(getClass() != obj.getClass())
	  {
		  if(other.eirCode != null)
		  {
			  return false;
		  }
	  }
	  else if (!eirCode.equals(other.eirCode))
		 return false;
	return true; 
  }
  public String getEircode()
  {
	  return eirCode;
  }
  public void setEirCode(String eircodeIn)
  {
	  this.eirCode = eirCode;
  }

}
