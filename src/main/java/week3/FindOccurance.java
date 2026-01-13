package week3;

public class FindOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str = "Testleaf Selenium";
		 
		 int a =0;
	      char[] ch = str.toCharArray();
	      for (int i = 0; i < ch.length; i++) 
	      {
	    if (ch[i]=='e')
	    {
	    	a++;
	    }
	      }
	
   System.out.println("The count of character 'e' is  :" + a);
	}

}
