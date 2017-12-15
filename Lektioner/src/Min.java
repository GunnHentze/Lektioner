
public class Min {
		public static double min(double a, double b, double c){
			double[] numbers = {a, b, c}; 
			double min = numbers[0];
			for( int j = 0; j<2; j++){
				
				if(min >numbers[j+1]){
					min = numbers[j+1];
				}
					
			}
			return min;
		}
}
