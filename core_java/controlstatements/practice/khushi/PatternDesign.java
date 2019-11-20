package controlstatements.practice.khushi;

public class PatternDesign {
	public static void main(String[] args) {
		System.out.println("Pattern -1");
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Pattern - 2");
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("Pattern - 3");
		
		for(int i=6;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("Pattern -4");
		int alpha = 64;// ascii value of A is 65
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(alpha + j)  + " ");
			}
			System.out.println();
		}
		
		System.out.println("Pattern -5");
		int alpha1 = 64;
		for(int i=6;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)(alpha1 + i)  + " ");
			}
			System.out.println();
		}
		
	}

}
