package chapter01;

import java.util.Scanner;

public class WhileTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int sum=0;
		
		while(true){
			System.out.println("숫자 입력[0 to quit]");
			int value= sc.nextInt();
			
			if(value==0){
				break;
			}
			sum +=value;
		}
		System.out.println(sum);
		sc.close();
	}

}
