package chapter01;

public class NumberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length==0){
			return;
		}
		
		int number= Integer.parseInt(args[0]);
		
		for(int i=1; i<number; i++){
			
			for(int j=0; j<i; j++){
				
				System.out.print(i);
			}
			System.out.print("\n");

		}
		}

}
