import java.util.*;

public class O08Andengrads {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double a, b, c, x, x1;

		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();

		if(a == 0){
			if(b==0 || c == 0){
				System.out.println("Ingen rødder");
			}
			else{
				x = -c/b;
				System.out.print(x);
			}
		}
		else if( b == 0){
			if(a == 0 || c == 0){
				System.out.println("Ingen rødder");
			}
			else{
				if(-c/a<0){
					System.out.print("Ingen rødder");
				}
				else{
					x= Math.sqrt(-c/a);
					System.out.print(x);
				}
			}
		}
		else if(c == 0){
			if(a == 0 || b == 0){
				System.out.println("Ingen rødder");
			}
			else{
				x1 = 0;
				x = -b/a;
				if(x1>x){
					System.out.print(x1 + " " + x);
				}
				else if(x1<x){
					System.out.print(x + " " + x1);
				}
				else{
					System.out.print(x);
				}
			}
		}
		else{
			if(Math.pow(b, 2)-4*a*c <0){
				System.out.print("Ingen rødder");
			}
			else{
				x = (-b + Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
				x1 = (-b - Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
				if(x1>x){
					System.out.print(x1 + " " + x);
				}
				else if(x1<x){
					System.out.print(x + " " + x1);
				}
				else{
					System.out.print(x);
				}
			}
		}
		scanner.close();

	}
}
