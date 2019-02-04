package btesmani;
import java.util.Scanner;
class Prime2
{
public static void main(String args[])
{
boolean flag=true;
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
for(int i=1;i<=100;i++)
{
for( int j=2;j<=i;j++)
{
if(i%j==0)
{
flag=false;
break;
}
}
if(flag==false)
{
System.out.println(i);
}
}
}
}