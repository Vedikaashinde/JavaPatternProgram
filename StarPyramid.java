package PatternProgram;

public class StarPyramid {
	
	public static void main(String[] args) {
		
		int row=7;
		
		for (int i = 0; i <row; i++) {
			for (int j = 0; j <=row-i-1; j++) {
				System.out.print(" ");
		}
			for (int j = 0; j < i; j++) {
				System.out.print(i+" ");
				
			}
			System.out.println();
		}
	}

}
