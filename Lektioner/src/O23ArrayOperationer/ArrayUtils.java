package O23ArrayOperationer;

public class ArrayUtils {
	public static void main(String[] args){
		int arr[] = {1,2,3,4,5,4,3,2,1};
		
		System.out.println(arrayToString(arr));
		System.out.println();
		System.out.println(occurences(arr, 2));
		System.out.println();
		System.out.println(sum(arr));
		
		
	}
	
	public static String arrayToString(int[] a){
		String result ="{";
		for(int i=0; i<a.length-1; i++){
			result += a[i]+" ";
		}
		
		result += a[a.length-1]+"}";
		return result;
	}
	
	public static int occurences(int[] a, int n){
		int occ=0;
		for(int i=0; i<a.length; i++){
			if(a[i] == n)
				occ++;
		}
		return occ;
	}
	public static int sum(int[] a){
		int sum =0;
		for(int i=0; i<a.length;i++){
			sum += a[i];
		}
		return sum;
	}
}
