import java.util.Scanner;

public class O13aPyramider {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if(n<1){
			sc.close();
			return;
		}

		System.out.println("Pyramid 1");
		System.out.println("#");

		for(int k=2;k<=n;k++){
			System.out.println("Pyramid "+k);
			for(int i=0; i<k; i++){
				int numDots = k-i-1;
				for(int j=0; j<numDots;j++){
					System.out.print(".");
				}
				int number =i*2+1;
				for(int j=0; j<number; j++){
					System.out.print("#");
				}
				for(int j=0; j<numDots;j++){
					System.out.print(".");
				}
				System.out.println();
			}
			System.out.println();
		}
		sc.close();
	}

}

