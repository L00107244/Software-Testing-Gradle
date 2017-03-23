
public class Address
{
	private String Address;
	private eircode eircode =null;
	
	public Address(String AddOne, String eirCodeIn)
	{
		Address = AddOne;
		this.eircode = new eircode(eirCodeIn);
	}
	public void SetAddress(String AddressIn)
	{
       this.Address = AddressIn;
	}
	public String GetAddress()
    {
		  return Address;
	}
	@Override
	public String toString()
	{
		return "Address: "+Address;
	}
}
