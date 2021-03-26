package singleloop;

import java.util.Scanner;

public class swapwithoutthird
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of a and b");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("before swap value of a " +a);
		System.out.println("before swap value of b " +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap value of a " +a);
		System.out.println("after swap value of b " +b);
		
				
		
	}

}
