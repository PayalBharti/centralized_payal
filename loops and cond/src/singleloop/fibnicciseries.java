package singleloop;

public class fibnicciseries 
{
	public static void main(String[] args) 
	{
		int x=0;
		int y=1;
	    int z;
	    System.out.println(x);
	    System.out.println(y);
		for(int i=0;i<=12;i++)
		{
		z=x+y;
		System.out.println(z);
		x=y;
		y=z;
		
	}

}
}