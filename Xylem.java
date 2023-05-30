package com.jsp;

public class Xylem {
public static boolean isXylemNmuber(int n) {
	int outersum=0;
	int innersum=0;
	int count1=0;
	int count2=0;
	int p=n;
	//to count the number digit
	while(n>0) {
		n=n/10;
		count1++;
	}
	while(p>0) {
		int last_digit=p%10;
		count2++;
		if(count2==1||count1==count2) {
			outersum=outersum+last_digit;
		}else {
			innersum=innersum+last_digit;
		}
		p=p/10;
	}
	if(outersum==innersum) {
		return  true;//xylem
	}else {
		return false;//pholem
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isXylemNmuber(1447));
	}

}
