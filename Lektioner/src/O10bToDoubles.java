import java.util.Scanner;

public class O10bToDoubles {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		
		if(d1 !=d2){
			System.out.println("false");
		}
		else System.out.println("true");
		
		
		sc.close();
	}
}
