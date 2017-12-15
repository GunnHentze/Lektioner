import java.util.Scanner;
public class BonusArrayGym {


	public static void main(String[] args) {
		int[] ints = parseInput();
		//TODO Fill in logic


		//TODO Print the result to console
		for(int i=0; i<ints.length;i++){
			System.out.print(ints[i]+" ");
		}
	}

	private static int[] parseInput() {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] strings = input.split(" ");
		int[] ints = new int[strings.length]; 
		for (int i = 0;i<ints.length;i++) {
			ints[i] = Integer.parseInt(strings[i]);
		}

		int[] intCopy = new int[ints.length-1];

		int n= ints[ints.length-1];
		if(n<0){
			n = n*-1;
			n = n%intCopy.length;
			for(int i=0; i<n; i++){
				intCopy[intCopy.length-n+i] = ints[i];
			}
			for(int i=n; i<intCopy.length;i++){
				intCopy[i-n] = ints[i];
			}
		}
		else //(n<ints.length && n>0){
		{
			n = n%intCopy.length;
			for(int i=0; i<n; i++){
				intCopy[i] = ints[intCopy.length-n+i];
			}
			for(int i=n; i<intCopy.length;i++){
				intCopy[i] = ints[i-n];
			}
		}
		
		
		
		scan.close();
		return intCopy;
	}

}