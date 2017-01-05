package chapter01;

import java.util.Scanner;

import javax.naming.directory.SearchControls;

public class PowerOfTwo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("승수: ");
		int pow= sc.nextInt();
		
		int result=1;
		for(int i=1; i<=pow; i++ ){
			
			result= (int)Math.pow(2, pow);

		}
		System.out.println("2의 "+ pow + "제곱근은 " + result + "입니다.");
	}

}
