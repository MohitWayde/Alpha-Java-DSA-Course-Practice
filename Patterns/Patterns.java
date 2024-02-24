package Patterns;

public class Patterns {
	public static void hollow_rect(int totalRowCount, int totalColumnCount) {
		for (int i = 1; i <= totalRowCount; i++) {
			for (int j = 1; j <= totalColumnCount; j++) {
				if (i == 1 || i == totalRowCount || j == 1 || j == totalColumnCount) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public static void inverted_rotated_half_pyramid(int rows) {
		for (int i = 1; i <= rows; i++) {
			// Loop for printing spaces
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}

			// Loop for printing Star
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	public static void inverted_half_pyramid_withNumbers(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	public static void floyd_triangle(int n) {
		int counter = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(counter + " ");
				counter++;
			}
			System.out.println();
		}
	}

	public static void binaryTriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

	public static void butterflyPattern(int n){
		// 1st Half
		for(int i=1;i<=n;i++){
			// Stars
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			// Spaces
			for(int j=1;j<=2*(n-i);j++){
				System.out.print(" ");
			}
			// Stars
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 2nd Half
		for(int i=n;i>=1;i--){
			// Stars
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			// Spaces
			for(int j=1;j<=2*(n-i);j++){
				System.out.print(" ");
			}
			// Stars
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void solidRhombus(int n){
		for(int i=1;i<=n;i++){
			// For spaces
			for(int j=1;j<=(n-i);j++){
				System.out.print(" ");
			}

			// For Stars
			for(int j=1;j<=n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void hollowRhombus(int n){
		for(int i=1;i<=n;i++){
		// For Spaces
		for(int j=1;j<=(n-i);j++){
			System.out.print(" ");

		}
		
		// For stars - (Use the logic of hollow rectangle but just tilted)
		for (int j=1; j <=n; j++) {
			if (i==1 || i==n || j==1 || j==n) {
				System.out.print("*");				
			}
			else{
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}
	}

	public static void diamondPattern(int n){
		// 1st Half
		for(int i=1;i<=n;i++){
			//for spaces
			for(int j=1;j<=(n-i);j++){
				System.out.print(" ");
			} 
			// For Stars
			for(int j=1;j<=((2*i)-1);j++){
				System.out.print("*");
			}
			System.out.println();
		}
		// 2nd Half
		for(int i=n;i>=1;i--){
			//for spaces
			for(int j=1;j<=(n-i);j++){
				System.out.print(" ");
			} 
			// For Stars
			for(int j=1;j<=((2*i)-1);j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}



	public static void main(String[] args) {
		int n = 7, totalRow = 5, totalColumn = 5;
		// hollow_rect(totalRow,totalColumn);
		// inverted_rotated_half_pyramid(totalRow);
		// inverted_half_pyramid_withNumbers(totalRow);
		// floyd_triangle(n);
		// binaryTriangle(n);
		// butterflyPattern(n);
		// solidRhombus(n);
		// hollowRhombus(4);
		diamondPattern(n);
	}
}
