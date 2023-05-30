package com.jsp;

public class StrongNumber {
public static boolean isStrongNumber(int n) {
	int sum=0;
	int temp=n;
	while(temp>0) {
		int last_digit=temp%10;
		int fact=1;
		for(int i=1;i<=last_digit;i++) {
			fact=fact*i;
		}
		sum=sum+fact;
		n=n/10;
	}
	if(sum==temp) {
		return true;
	}else {
		return false;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isStrongNumber(145));
	}

}
