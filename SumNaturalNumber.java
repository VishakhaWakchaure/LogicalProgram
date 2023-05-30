package com.jsp;

public class SumNaturalNumber {
public static int isSumOfNaturalNumber(int n) {
	int sum=0;
	for(int i=1;i<=n;i++) {
		sum=sum+i;
	}
	return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println(isSumOfNaturalNumber(5));
	}

}
