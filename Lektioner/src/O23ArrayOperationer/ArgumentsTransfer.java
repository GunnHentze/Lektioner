package O23ArrayOperationer;


public class ArgumentsTransfer{
	public static int b;
	public static void main(String[] args){
		int a = 1; b=2; 
		int[] c; c = new int[2];
		c[0]=3; c[1]=4;
		print(a, b, c);
		
		test1(a,b,c);
		print(a, b, c);
		
		a = 1; b=2; 
		c[0]=3; c[1]=4;
		a=test2(a,b,c);
		print(a, b, c);
		
	}//end main 
	
	public static void print(int a, int b, int[] c){
		System.out.println("a="+a+" b="+b +" c[0]="+c[0]+" c[1]="+c[1]);
	}
	
	public static void test1(int a, int b, int[] z){ 
		a++;
		b=b+a;
		z[0]=a;
		z[1]=2*b;
	}// end test1
	
	public static int test2(int x, int y, int[] z){  
		x++;
		y=y+x;
		z=new int[2];
		z[0]=x;
		z[1]=2*y;
		b=20;
		return z[0]+z[1];	
	}// end test2
}
