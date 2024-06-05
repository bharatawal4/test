package calc;

import java.security.PublicKey;

public class operation {
	static int result;
	
	public static void sum(int a,int b) {
		result=a+b;
		System.out.println("addition of number : "+result);
		
	
	}
	public static void sub(int a,int b) {
		result=a-b;
		
		System.out.println("substraction of number : "+result);

		
		
	}
	public static void mul(int a,int b) {
		result=a*b;
		System.out.println("multiplication of number : "+result);

		
		
	}
	public static void div(int a,int b) {
		result=a/b;
		System.out.println("division of number : "+result);

		
		
	}

}
