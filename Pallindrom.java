package com.jsp;

public class Pallindrom {
public static boolean isPallindromNumber(int n) {
	int rev=0;
	int temp=n;
	while(n>0) {
		int temp2=n%10;
		rev=rev*10+temp2;
		n=n/10;
	}
	if(temp==rev) {
		return true;
	}else {
		return false;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isPallindromNumber(121));
	}

}
