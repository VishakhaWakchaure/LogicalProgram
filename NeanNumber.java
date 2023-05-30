package com.jsp;

public class NeanNumber {
public static boolean isNeanNumber(int n) {
	int sum=0;
	int square=n*n;
	while(square!=0) {
		int last_digit=square%10;
		sum=sum+square;
		square=square/10;
	}
	if(sum==n) {
		return false;
	}else {
		return true;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isNeanNumber(9));
	}

}
