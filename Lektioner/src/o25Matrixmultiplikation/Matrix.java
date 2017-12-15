package o25Matrixmultiplikation;

public class Matrix {
	public static void main(String[] args){
		int [][] a={{1,2},    // 0. row
					{3,1}};   // 1. row

		int [][] b={{1,1,1},  // 0. row
					{1,1,1}}; // 1. row
		int[][] c;
		printMatrix(a);
		printMatrix(b);
		if (a[0].length==b.length){ 
			// column length in "a" is same as row length in "b"
			c= multiplication(a,b);
			printMatrix(c);
		} else{
			System.out.print("matrixmultiplikation kan ikke udføres");
		}
	}
	
	public static int[][] multiplication(int [][] a, int [][] b){
		int l = a.length;   //row length in a
		int m = a[0].length;//column length in a 
		int n = b[0].length;//column length in b
		int[][] resultat = new int[l][n];
		for(int i=0; i<l; i++){
			for(int j=0; j<n;j++){
				for(int k=0; k<m; k++)
				resultat[i][j]+= a[i][k]*b[k][j];
			}
		}
		return resultat;
	}
	
	public static void printMatrix(int[][] a){
		for(int i=0; i<a.length;i++){
			for(int j=0; j<a[0].length;j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
