package btesmani;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class s2 {
int roll_no;
String name;
char grade;
double eng_marks, maths_marks, sci_marks, tot_marks, avg;
BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
s2() throws IOException{
System.out.println("enter marks in english,maths,& science");
eng_marks=Double.parseDouble(s.readLine());	
maths_marks=Double.parseDouble(s.readLine());
sci_marks=Double.parseDouble(s.readLine());
}
public static void main(String[]args)throws IOException
{
s2 a=new s2();
a.cal_total();
a.cal_avg();
a.find_grade();
}
void cal_total()
{
tot_marks=eng_marks+maths_marks+sci_marks;
System.out.println("total marks are"+tot_marks);
}
void cal_avg() 
{	
avg=tot_marks/3;
System.out.println("average is"+avg);
}
void find_grade()
{
int a=(int)(avg/10);
switch(a)
{
case 10:
case 9:
System.out.println("A grade");
break;

case 8:
case 7:
System.out.println("B grade");
break;

case 6:
case 5:
System.out.println("C grade");
break;

case 4:
case 3:
System.out.println("D grade");
break;

case 2:
case 1:
System.out.println("E grade");
break;
	}

}
}
