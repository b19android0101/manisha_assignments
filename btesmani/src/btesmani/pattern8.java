package btesmani;

public class pattern8 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++)
		{
			for(int j=9;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				if(i%2!=0) {
			System.out.print("* ");
			}
				}
			System.out.println(" ");
		}
			

		}




	}


