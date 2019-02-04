package btesmani;
import java.util.Scanner;

public class trio
{
	public static void main(String args[])
	{
int n, a=0,b=0,c=0,d=1;
Scanner sc=new Scanner(System.in);

System.out.println("enter fibo limit" );
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
	a=b;
	b=c;
	c=d;
	d=a+b+c;
	System.out.println(d);
	}
}
}
