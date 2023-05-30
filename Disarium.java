package com.jsp;

public class Disarium {
		public static boolean isDisariumNumber(int n) {
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
				count--;
				sum=sum+pro;
				z=z/10;
				
				}
			if(n==sum) {
				return true;//   1^1+7^2+5^3=175        sum==n
			}else {
				return false;
			}
			}
			
			public static void main(String[] args) {
				
		System.out.println(isDisariumNumber(175));
			}

		

	}


