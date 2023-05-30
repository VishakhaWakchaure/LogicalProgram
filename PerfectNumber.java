package com.jsp;
public class PerfectNumber{
public static  boolean isPerfectNumber(int n) {
	int sum=0;
	for(int i=1;i<n;i++) {
		if(n%i==0) {
			sum=sum+i;
		}
	}
	if(sum==n) {
		return true;
	}else {
		return false;
	}
}
	public static void main(String[] args) {
   System.out.println(isPerfectNumber(6));


}}