package btesmani;

import java.util.Scanner;

public class array3min {
	public static void main(String [] args) {
		int[] a= new int[10];
		int n,i,item,loc=-1;
		boolean exist=false;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter how many elements ");
		n=sc.nextInt();
		System.out.println("enter elements");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("enter the item to be searched");
		item=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==item) {
				loc=i;
						exist=true;
				break;
			}
		}
		if(exist)
			System.out.println();
		
	}

}
