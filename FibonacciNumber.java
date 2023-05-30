package com.jsp;

public class FibonacciNumber {
public static int isFibonacciNumber(int n) {
	int x=0;
	int y=1;
	int z=0;
	while(z<=n) {
		System.out.print(z+" ");
		x=y;
		y=z;
		z=x+y;
	}
	return z;
	
}
	public static void main(String[] args) {
	System.out.println(isFibonacciNumber(13));

	}

}
