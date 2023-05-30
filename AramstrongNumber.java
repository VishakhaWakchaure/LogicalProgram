package com.jsp;
// 153=1!+5!+3!=153
public class AramstrongNumber {
public static boolean isAramstrongNumber(int n) {
	int count=0;
	int sum=0;
	int z=n;
	int temp=n;
	//too count the number digit
	while(temp>0) {
		temp=temp/10;
		count++;
	}
	
	
	while(z>0) {
		int last_digit=z%10;
		int pro=1;
		for(int i=1;i<=count;i++) {
			pro=pro*last_digit;
		}
		sum=sum+pro;
		z=z/10;
		
		}
	if(n==sum) {
		return true;
	}else {
		return false;
	}
	}
	
	public static void main(String[] args) {
		
System.out.println(isAramstrongNumber(153));
	}

}
