package com.jsp;

public class Factorial {
public static int isFactorialNumber(int n) {
	int pro=1;
	for(int i=1;i<=n;i++) {
		pro=pro*i;
	}
	return pro;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isFactorialNumber(5));
		
	}

}
