package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("소수인지 판단할 숫자: ");

		int divisor=2;
		int num= sc.nextInt();
		boolean isPrime= true;
		
		//판단 알고리즘
		while(divisor < num){
			if(num % divisor ==0)
				divisor++;
		}
		//출력
	}

}
