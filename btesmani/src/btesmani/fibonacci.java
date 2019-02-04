package btesmani;
import java.util.Scanner;

public class fibonacci
{
	public static void main(String args[])
	{
int n, a=0,b=0,c=1;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println(" fibo limit" );

for(int i=1;i<=n;i++)
{
	a=b;
	b=c;
	c=a+b;
	System.out.println(c+" ");
	}
}
}
