import java.util.*;


public class O07Passwords {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		String password = scanner.nextLine();
		
		if(password.length()<=4){
			System.out.println("Password for kort");
		}
		else if(password.length()>=9){
			System.out.println("Password for langt");
		}
		else System.out.println("Password tilpas");
		
		scanner.close();
	}
}
