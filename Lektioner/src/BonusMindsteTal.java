import java.util.Scanner;

public class BonusMindsteTal {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);		
		double[] numbers = new double[3];
		
		for(int i=0; i<3; i++){
			numbers[i] = scanner.nextDouble();
		}
	
		System.out.print(Min.min(numbers[0],numbers[1],numbers[2]));
		
		scanner.close();
		
	}
	
}
