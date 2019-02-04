package btesmani;
import java.util.Scanner;
class Great
{
public static void main(String args[])
{ 
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter three numbers");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if((a>b)&&(a>c))
{
System.out.println("a is greatest number");
}
else if((b>a)&&(b>c))
{
System.out.println("b is greatest number");
}
else
{
System.out.println("c is greatest number");
}
}
}