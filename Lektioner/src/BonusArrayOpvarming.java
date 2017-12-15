import java.util.Scanner;
public class BonusArrayOpvarming {


	public static void main(String[] args) {
		int[] ints = parseInput();
		//TODO Fill in logic


		//TODO Print the result to console
		System.out.println();
	}

	private static int[] parseInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] strings = input.split(" ");
		int[] ints = new int[strings.length]; 
		int count = 0;
		for (int i = 0;i<ints.length;i++) {
			ints[i] = Integer.parseInt(strings[i]);
			if(ints[i]%2==0)
				count++;
		}
		
		System.out.println(count);
		scan.close();
		return ints;
	}

}