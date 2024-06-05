package calc;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);			//scanner object created
		System.out.println("enter the number a ");
		int a=sc.nextInt();							//take a input
		Scanner scc=new Scanner(System.in);
		System.out.println("enter the number b ");
		int b=scc.nextInt();						//take a input
		
		operation obj= new operation();				//object created for different class outside a box
		obj.sum(a,b);
		obj.sub(a,b);
		obj.mul(a,b);
		obj.div(a,b);
		

	}

}
