import java.util.Scanner;

public class O14Trekanter {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		
		System.out.print("Indtast sidelængden a: ");
		a = sc.nextDouble();
			
		System.out.print("Indtast sidelængden b: ");
		b = sc.nextDouble();
		
		System.out.print("Indtast sidelængden c: ");
		c = sc.nextDouble();
		
		
		double vinkelA = Math.acos((b*b+c*c-a*a)/(2*b*c));
		double vinkelB = Math.acos((a*a+c*c-b*b)/(2*a*c));
		double vinkelC = Math.acos((a*a+b*b-c*c)/(2*a*b));
		
		
		if(a<=0 || b<=0 || c<=0)
			System.out.println("Noget er galt!");
		else if(a+b<=c || a+c<b || b+c<a){
			System.out.println("Noget er galt!");
		}
		else if(a==b && b==c)
			System.out.println("Trekanten er ligesidet");
		else if(a==b || b==c || c==a)
			System.out.println("Trekanten er ligebenet");
		else if(a*a+b*b == c*c || a*a+c*c == b*b || b*b+c*c == a*a)
			System.out.println("Trekanten er retvinklet");
		else if(vinkelA<=Math.PI/2 && vinkelB<=Math.PI/2 && vinkelC<=Math.PI/2)
			System.out.println("Trekanten er spids");
		else
			System.out.println("Trekanten er stump");
		
		sc.close();
		
	}
}