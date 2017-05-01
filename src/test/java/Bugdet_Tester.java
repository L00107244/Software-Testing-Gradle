import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class Bugdet_Tester 
{
	   @InjectMocks 
	   budget_manager budget = new budget_manager();
	   
	   @Mock
	   bugetMangerInterface BudgetService;
	   
	   @Test
	   public void testSubtract(){
	      when(BudgetService.subtract(3333.33,80.0, 50.0, 22.00, 20.00, 100.00, 80.00, 26.00 )).thenReturn(2955.33);
			
	      Assert.assertEquals(BudgetService.subtract(3333.33,80.0, 50.0, 22.00, 20.00, 100.00, 80.00, 26.00 ),2955.33,0);
	   }
	   @Test
	   public void testMultiply()
	   {
	      when(BudgetService.multiply(3333.33,0.40 )).thenReturn(1333.332);
			
	      Assert.assertEquals(BudgetService.multiply(3333.33,0.40 ),1333.332,0);
	   }
	   @Test
	   public void testMultiplyMethod()
	   {
	      when(budget.Aftertax(4333.33)).thenReturn(1733.33);
			
	      Assert.assertEquals(budget.Aftertax(4333.33),1733.33,0);
	   }
	   @Test
	   public void testSubtractMethod(){
	      when(budget.AfterBills(3333.33,80.0, 50.0, 22.00, 20.00, 100.00, 80.00, 26.00 )).thenReturn(2955.33);
			
	      Assert.assertEquals(budget.AfterBills(3333.33,80.0, 50.0, 22.00, 20.00, 100.00, 80.00, 26.00),2955.33,0);
	   }
	   @Test
	   public void test_multiply_for_twenty_percent()
	   {
		      when(BudgetService.multiply(2000.00,0.20 )).thenReturn(400.00);
				
		      Assert.assertEquals(BudgetService.multiply(2000.00,0.20 ),400.00,0);
	   }
	   @Test
	   public void test_After_tax_method_with_twenty_percent_tax(){
	      when(budget.Aftertax(2000.00 )).thenReturn(400.00);
			
	      Assert.assertEquals(budget.Aftertax(2000.00),400.00,0);
	   }
	   
}
