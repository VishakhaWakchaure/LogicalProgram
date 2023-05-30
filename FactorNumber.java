package com.jsp;

public class FactorNumber {
public  void isFactorNumber(int n) {
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			System.out.print(i+" ");
		}
	
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
FactorNumber fc=new FactorNumber();
fc.isFactorNumber(8);
	}

}
