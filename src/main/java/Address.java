/*
 * Name Stephen Curran
 * Student Number: L00107244
 * E-mail L00107244@student.lyit.ie
 */
public class Address
{
	//variables
	private final String Addressline1;
	private final String AddressLine2;
	private final String AddressLine3;
	private final String AddressLine4;
	private final String Country;
	private final eircode eircode;
	
   //constructer
	public Address(String Add1, String Add2, String Add3, String Add4, String Coun, eircode eircode)
	{
		this.Addressline1 = Add1;
		this.AddressLine2 = Add2;
		this.AddressLine3 = Add3;
		this.AddressLine4 = Add4;
		this.Country = Coun;
		this.eircode = eircode;
	}
	/*
	 * Get methods for each of the variables
	 */
	public String GetAddressLine1()
	{
		return Addressline1;
	}
	public String GetAddressLine2()
	{
		return AddressLine2;
	}
	public String GetAddressLine3()
	{
		return AddressLine3;
	}
	public String GetAddressLine4()
	{
		return AddressLine4;
	}
	public String GetCountry()
	{
		return Country;
	}
	public eircode getEirCode()
	{
		return eircode;
	}
}
