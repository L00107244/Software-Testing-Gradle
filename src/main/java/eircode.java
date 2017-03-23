
public class eircode
{
  private String eirCode  = null;
  private String CanidateEirCode = null;
  
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
	  this.eirCode=CanidateEirCode;
  }
  @Override
  public String toString()
  {
	  return "eircode [eircode="+eirCode+"]";
  }
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
