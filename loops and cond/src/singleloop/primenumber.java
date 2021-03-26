package singleloop;
import java.util.Scanner;
public class primenumber
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		int n=s.nextInt();
		int v=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				v=v+1;
			}
		}
			if(v==0)
			
			System.out.println("number is prime");
			
			else
				System.out.println("number is not  prime");
				
		
	}
	}



