package week1.sat1;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int num1 = 0;
		int num2 = 1;
		for(int i=0; i<x; i++)
		{
			System.out.println("The Given number "+num1);
			int num3 = num1 + num2;
			num1 = num2;
			num2=num3;
		}
			}
		}
