package singleloop;
import java.util.Scanner;
public class swapwiththird
{
	public static void main(String[] args) 
	{
		System.out.println("enter the value of a and b");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("before swap value of a " +a);
		System.out.println("before swap value of b " +b);
		int c=b;
		b=a;
		a=c;
		System.out.println("after swap value of a " +a);
		System.out.println("after2 swap value of b " +b);
		
				
		
	}
	

}
