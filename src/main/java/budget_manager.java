/*
 * Name Stephen Curran
 * Student Number: L00107244
 * E-mail L00107244@student.lyit.ie
 */
public class budget_manager 
{
  private bugetMangerInterface budMan;
	/*
	 * Variables
	 */

  private double bud;
  private double bud2;
  private double tax;

  public void SetBudService(bugetMangerInterface budget)
  {
	  this.budMan = budget;
  }
  public double AfterBills(double monthly_salary, double bill1, double bill2, double bill3, double TopUp, double food, double petrol, double other  )
  {
	  bud = budMan.subtract(monthly_salary, bill1, bill2, bill3, TopUp, food, petrol, other);
	  return bud;
  }
  public double Aftertax(double monthly_salary)
  {
	  if(monthly_salary > 3333.33)
	  {
	      tax = 0.40;
		  bud2 = budMan.multiply(bud, tax);
	  }
	  else if( monthly_salary < 3333.33)
	  {
	      tax = 0.20;
		  bud2 = budMan.multiply(monthly_salary, tax);
		  
	  }
	  else
	  {
		  throw new IllegalArgumentException("invalied Title");
	  }
	  return bud2;
  }
  
}
