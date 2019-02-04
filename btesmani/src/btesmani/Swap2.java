package btesmani;
import java.util.Scanner;
public class Swap2 {

	public static void main(String[] args) {
	int a,b;
	Scanner sc = new Scanner(System.in);
System.out.println("enter the value of a:");
a=sc.nextInt();
System.out.println("enter the value of b");
b=sc.nextInt();
System.out.println("Before swapping -a:"+a+",b:"+b);
int temp;
temp=a;
a=b;
b=temp;
System.out.println("Before swapping -a:"+a+",b:"+b);
	}

}
