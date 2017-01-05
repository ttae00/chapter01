package chapter01;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int sum=0;
		
		int value=-1;//첫번째 루프 진입을 위해 -1로 초기화시켜준다
		do{
			System.out.println("숫자입력[0 to quit]");
			value=sc.nextInt();
			sum += value;
			
		}while(value != 0);
		
			System.out.println(sum);
			sc.close();
	}

}