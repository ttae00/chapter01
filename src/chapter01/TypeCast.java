package chapter01;

public class TypeCast {

	public static void main(String[] args) {
		
		//암시적 캐스팅
		int i1 = 9999 ;
		long l1 = i1;
		
		//명시적 캐스팅
		long l2 = 9293994959L;
		int i2= (int)l2;
		
		System.out.println(l1 + ":" + i1);
		System.out.println(l2 + ":" + i2);
		
		byte b = 25;
		short s = b;
		int i = s;
		long l = i;
		float f = i;
		double d = f;

		byte b1 = (byte)256;

		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);

		System.out.println("f = " + f);
		System.out.println("d = " + d);
		System.out.println("b1 = " + b1);
	}

}
