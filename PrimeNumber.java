package com.jsp;

public class PrimeNumber {
public static boolean isPrimeNumber(int n) {
	int count=0;
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
		count++;
	}}
	if(count==2) {
		return true;
	}else {
		return false;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(isPrimeNumber(5));
	}

}
