package chapter01;
/**
 * 
 * @author 태영
 * 두번째 수업
 *
 */
class Arith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a= 7;
		int b= 3;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		a= a+1;
		System.out.println(a);
		
		a +=1;
		System.out.println(a);
		
		a++;
		System.out.println(a);
		
		++a;
		System.out.println(a);
		
		a--;//a= a-1;
		System.out.println(a);
		
		--a;//a -= 1;
		System.out.println(a);
		
		//System.out.println( a++ ); 아래코드랑 같은 것
		System.out.println(a);
		a++;
		
		//현재 a의 값은? 10
		
		//System.out.println(++a);
		a++;
		System.out.println(a);
		
		//나누기 연산
		
		//2개의 int형의 사칙연산 결과는 int
		System.out.println( 10 / 3 );
		//2개의 double형의 사칙연산 결과는 double
		System.out.println( 10. / 3. );
		//int형과 double형의 사칙연산 결과는 double
		System.out.println(10. / 3);
		
		System.out.println( (double)10 / 3 );
		
		//주의 괄호안 숫자먼저 계산된다
		System.out.println((double)(10/3));
		
		//나머지 연산
		System.out.println( 44 % 3 );
		
		System.out.println( -7 % 3 );
		
		System.out.println( 7 % -3 );
	}

}
