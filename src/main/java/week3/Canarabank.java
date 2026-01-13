package week3;

public abstract class Canarabank implements Payments{
	
	String name ;
	
	public  void recorddetails()
	{
		
		System.out.println("Name " +name);
		
	}
	
	
	public  void cashonDelievery()
	{
		
		System.out.println("cash payment made");
		
	}
		
	public void upipayments()
	{
		
		System.out.println("UPI payment made");
		
	}
	
	public void cardPayment()
	{
		
		System.out.print("card payment made");
		
	}
	
	
	public void internetbank()
	{
		
		System.out.print("Net payment made");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
