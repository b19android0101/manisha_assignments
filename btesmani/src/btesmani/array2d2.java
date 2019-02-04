package btesmani;
import java.util.Scanner;
public class array2d2 {

	public static void main(String[] args) {
		int[][] a=new int[3][4];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element of array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
				
			}
		     }
		System.out.println("array element are");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
