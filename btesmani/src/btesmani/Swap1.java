package btesmani;

public class Swap1 {

	public static void main(String[] args) {
  int a,b;
  a=10;
  b=15;
  System.out.println("before swapping A="+a + "& B="+b);
  a = a+b;
  b = a-b;
  a = a-b;
  System.out.println("After swapping A="+a + "& B="+b);
	}

}
