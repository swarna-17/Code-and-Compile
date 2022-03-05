/*
The day corresponding to the first date of a given month is provided as input to the program. Then a specific date D of the month is provided. The program must  print the day (one among MON,TUE, WED, THU, FRI, SAT, SUN) of the date D.

Input Format:
First line will contain the day (one among MON,TUE, WED, THU, FRI, SAT, SUN) of the first date of the month.
Second line will contain the value of the date D as an integer value.

Output Format:
First line will contain the day of the date D


Sample Input/Output:

Example 1:
Input:
MON
10

Output:
WED

Explanation:
If it is Monday on 1st of the month, then 10th of the month will be a Wednesday. Hence WED is printed.

*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] str={"SUN","MON","TUE","WED","THU","FRI","SAT" };
		String str1=sc.next();
		int num=sc.nextInt(),temp=0;
		for(int i=0;i<7;i++){
		    if(str1.equals(str[i]))
		        temp=i-1;
		}
        if(result%7==0) System.out.println("SUN");
        else if(result%7==1)System.out.println("MON");
        else if(result%7==2)System.out.println("TUE");
        else if(result%7==3)System.out.println("WED");
        else if(result%7==4)System.out.println("THURS");
        else if(result%7==5)System.out.println("FRI");
        else if(result%7==6)System.out.println("SAT");
	}
}