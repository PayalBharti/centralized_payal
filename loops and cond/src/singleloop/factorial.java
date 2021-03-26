package singleloop;
import java.util.Scanner;
public class factorial
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	int f=1;
	for(int i=n;i>=1;i--)
	{
			f=f*i;
					
	}
	System.out.println("factorial of number " +f);
	}

}
