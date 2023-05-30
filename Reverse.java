package com.jsp;
import java.util.Scanner;
public class Reverse {
public static int isRevrseNumber(int n) {
	int rev=0;
	while(n>0) {
		int temp=n%10;
		rev=rev*10+temp;
		n=n/10;
		
	}
	return rev;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
System.out.println(isRevrseNumber(n));
	}

}
