import java.util.*;

public class O05Dist {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		double a, b, x0, y0, dist;
		
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		x0 = scanner.nextDouble();
		y0 = scanner.nextDouble();
		
		dist = Math.abs(a*x0 - y0+b)/(Math.sqrt(1 + Math.pow(a, 2)));
		System.out.println(dist);
		scanner.close();
	}
}
