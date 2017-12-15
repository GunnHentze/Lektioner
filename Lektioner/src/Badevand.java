

public class Badevand{
	public static void main(String[] args){
		int[] badetemp = new int[args.length];
		for(int i=0; i<args.length; i++){
			badetemp[i] = Integer.parseInt(args[i]);
		}
//		int[] badetemp = { 12, 10, 12, 14, 15, 16, 18, 18, 15 };
		System.out.println("Maksimum: " + maks(badetemp));
		System.out.println("Antal fald: " + antalfald(badetemp));

	}
	public static int maks(int[] badetemp){
		int max = 0;
		for(int i : badetemp){
			if(i>max){
				max = i;
			}
		}
		return max;
	}
	public static int antalfald(int[] badetemp){
		int count = 0;
		for(int i=1; i<badetemp.length; i++){
			if(badetemp[i-1]>badetemp[i])
			count++;
		}
		return count;
		
		
	}
}
