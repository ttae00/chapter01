package chapter01;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int result=1;
		System.out.println("승수");
		
		int pow= sc.nextInt();
		
		int i=0;
		//int temp=0;
		while(i< pow){
		//	temp= (int) Math.pow(2, pow);
			//result= temp;
			result= result *2;
			i++;
		}
		
		System.out.println("2의 "+ pow + "제곱근은 "+ result
				+ "입니다.");
		
	}

}
