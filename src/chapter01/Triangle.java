package chapter01;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="*";
		String temp;
		
		for(int i=1; i<6; i++){
			System.out.println(s);
			for(int j=0; j<i; j++){
				System.out.print(s);
			}
		}
	}

}
