package btesmani;
import java.util.Scanner;
class Elligible
{
public static void main(String agrs[])
{
int age;
String gender;
Scanner sc=new Scanner(System.in);
System.out.println("enter your gender");
gender=sc.nextLine();
System.out.println("enter your age");
age=sc.nextInt();
if(gender.equals("female"))
{
if(age>=18)
{
System.out.println("eligible for marriage");
}
else
{
System.out.println("not eligible for marriage");
}
}
else 
{
if(age>=21)
{
System.out.println("eligible for marriage");
}
else
{
System.out.println("not eligible for marriage");
}
}
}
}