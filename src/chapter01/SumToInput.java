package chapter01;

import java.util.Scanner;

public class SumToInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		
		int num= sc.nextInt();
		int sum=0;
		
		for(int i=0; i<= num; i++){
			sum= sum+i;
		}
		System.out.println(sum);
		sc.close();
	}
}
