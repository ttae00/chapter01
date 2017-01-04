package chapter01;

import java.io.BufferedReader;
import java.util.Scanner;

public class IOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Hello world");
		System.out.print("Hello world\n");
		System.out.print("Hello world");
		
		//줄만 바꿀 때
		System.out.println("");
		System.out.println("\n");
		System.out.println("Hello world");
		*/
		
		Scanner scanner= new Scanner(System.in);
		
		/*int count1 = scanner.nextInt();
		int count2 = scanner.nextInt();
		String str= scanner.next();
		
		System.out.println(count1 + ":" + count2 + str);
		
		*/
		String str2= scanner.next();
		System.out.println(str2);
		
		//한줄 다 가져옴
		/*String str3= scanner.nextLine();
		System.out.println(str3);*/
		
		//키보드 자원 정리
		scanner.close();
		
		
	}
}
