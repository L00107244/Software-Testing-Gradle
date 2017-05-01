public class budget_manager 
{
  private double monthly_salary;
  private double bill1;
  private double bill2;
  private double bill3;
  private double TopUp;
  private double food;
  private double petrol;
  private double anything;
  private double bud;
  
  public budget_manager(double monsal, double bill, double bill2, double bill3, double top, double foo, double pet, double any)
  {
	  this.monthly_salary = monsal;
	  this.bill1 = bill;
	  this.bill2 = bill2;
	  this.bill3 = bill3;
	  this.TopUp = top;
	  this.food = foo;
	  this.petrol = pet;
	  this.anything = any;
  }
  public void setMonthlySalary(double monSal)
  {
	  monthly_salary = monSal;
  }
  public void setbill(double bill)
  {
	  bill1 = bill;
  }
  public void setbill3(double bill)
  {
	  bill3 = bill;
  }
  public void setTopUp(double topup)
  {
	  TopUp = topup;
  }
  public void setfuel(double pet)
  {
	  petrol = pet;
  }
  public void setAnything(double any)
  {
	  anything = any;
  }
  public double getResult()
  {
	  bud =monthly_salary - bill1-bill2-bill3-TopUp-petrol-anything;
	  return bud;
  }
  public double getResultAfterTax()
  {
	  double taxHigh = 0.40;
	  double taxLow = 0.20;
	  if(monthly_salary <= 20000)
	  {
	  bud =monthly_salary - bill1-bill2-bill3-TopUp-petrol-anything;
	  }
	  if(monthly_salary >= 40000)
	  {
		  bud =monthly_salary - bill1-bill2-bill3-TopUp-petrol-anything; 
	  }
	  return bud;
  }
}
