import java.util.Scanner;


public class O12aPasswordIgen {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		while(true){
			String password = scanner.nextLine();

			if(password.length()<=4){
				System.out.println("Password for kort");
			}
			else if(password.length()>=9){
				System.out.println("Password for langt");
			}
			else{
				System.out.println("Password tilpas");
				scanner.close();
				break;
			}
		}


	}
}
