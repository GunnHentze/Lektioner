import java.util.Scanner;

public class O15GaetMitNavn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String navn, gaet;
		navn = sc.next();
		navn = navn.toLowerCase();
		do{
			gaet = sc.next();
			gaet = gaet.toLowerCase();
			if(navn.compareTo(gaet)>0)
				System.out.println("Mit navn er efter i alfabetet.");
			else if(navn.compareTo(gaet)<0)
				System.out.println("Mit navn er f�r i alfabetet.");
			if(navn.equals(gaet)){
				System.out.println("Du g�ttede rigtigt.");
				break;
			}
			
		}while(true);
		
		
		sc.close();
	}

}
