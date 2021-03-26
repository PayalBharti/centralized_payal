package singleloop;

import java.util.Scanner;
import java.util.Scanner;
public class armstrong
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int a=n;
		int sum=0;
		while(a!=0)
		{
			int q=a/10;
			int r=a%10;
			a=q;
			sum=sum+r*r*r;
		}
		if(sum==n)
		{
			System.out.println(" number is armstrong");
		}
		else
		{
			System.out.println("number is not armstrong");
		}
	}
}
