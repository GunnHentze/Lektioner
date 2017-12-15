import java.util.Scanner;

public class O10Sinus {
	public static int AMPLI = 20;
	public static int SAMPLES = 16;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		sc.close();
		for(int i=0; i<n;i++){
			for(double y=0; y<2*Math.PI;y+=2*Math.PI/16){
				double value = Math.sin(y)*20;
				int val = (int)Math.round(value);

				for(int x=-AMPLI; x<=AMPLI; x++){
					if(x == val)
						System.out.print("*");
					else if(x == 0)
						System.out.print("|");
					else System.out.print(" ");		
				}
				System.out.println();
			}
		}
	}
}
