package btesmani;
class Grade
{
public static void main(String args[])
{
int marks=100;
if(marks>=85)
{
System.out.println("Exellent");
}
else if(marks>=70&&marks<85)
{
System.out.println("Very good");
}
else if(marks>50&&marks<70)
{
System.out.println("Good");
}
else if(marks>40&&marks<50)
{
System.out.println("Average");
}
else
{
System.out.println("Fail");
}
}
} 