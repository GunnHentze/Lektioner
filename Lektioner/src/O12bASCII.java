import java.util.Scanner;

public class O12bASCII {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);	

		while(true){
			if(sc.hasNextInt()){
				int tal = sc.nextInt();
				if(tal <=9 && tal>=0){
					System.out.println("Tegnet er et tal");
				}
				else
					System.out.println("Tegnet er ikke kendt af dette program");
			}
			else if(sc.hasNext()){
				String text = sc.next();
				if(text.equals("exit")){
					sc.close();
					break;
				}
				else if(text.length()!=1)
					System.out.println("Tegnet er ikke kendt af dette program");
				else if(Character.isLowerCase(text.charAt(0)))
					System.out.println("Tegnet er et lille bogstav");
				else if(Character.isUpperCase(text.charAt(0)))
					System.out.println("Tegnet er et stort bogstav");
				else{
					String out;
					switch (text){
					case "#":
					case "!":
					case "+":
					case "\\":
						out = "Tegnet er et af de 4 specialtegn";
						break;
					default: out = "Tegnet er ikke kendt af dette program";
					}
					System.out.println(out);
				}	
			}
			else
				System.out.println("Tegnet er ikke kendt af dette program");

		}
	}
}
