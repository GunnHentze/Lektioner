
public class O12c {
	public static void main(String[] args){
		final int STOP = 10;
		int i;
		/*for(i=1; i<STOP; i++){
			System.out.println("i har nu v�rdien " + i);
		}*/
		i=1;
		/*do{
			System.out.println("i har nu v�rdien " + i);
			i++;
		}while(i<STOP);*/
		
		i=1;
		while(i<STOP){
			System.out.println("i har nu v�rdien " + i);
			i++;
		}
		
		
		/* Hvis STOP �ndres til 1, s� vil for l�kken og while
		 * ikke printe noget, mens do while l�kken vil printe 1 gang, for v�rdien 1.
		 */
	}
}
