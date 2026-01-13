package week1.sat1;

public class pallindrome {
	
public static void main(String[] args) 
	
{

     int num = 13421;
     
 	 int originalNum = num;
 	     int reverse = 0;

 	     while (num != 0) {
 	         int lastDigit = num % 10;
 	         reverse = reverse * 10 + lastDigit;
 	         num /= 10;
 	        	     }
 	     
 	     if (originalNum == reverse)
 	     {
 	     	    	 
 	    	 System.out.println(originalNum+ " is a palindrome number.");
 	     }
         else {
             System.out.println(originalNum + " is not a palindrome number.");
         }
             
}}

