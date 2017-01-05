package chapter01;

public class SumToInput02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length==0){
			System.out.println("usage: java sumToInput2 [number]");
			return;//종료하고 싶을 때	
		}
		//System.out.println(args[0]);
		
		//String -> int
		int num= Integer.parseInt(args[0]);
		
		//int -> String
		int n= 10;
		String s= ""+n;
		String s1= String.valueOf(n);
		
		
		int sum=0;
		
		for(int i=0; i<= num; i++){
			sum= sum+i;
		}
		
		System.out.println(sum);

	}
}
