package test;

import dato.Dato;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dato d1 = new Dato(2015, 9, 8);
		Dato d2 = new Dato(1999, 1, 2);
		
		
		System.out.println(d1.danish());
		System.out.println(d2.danish());
	}

}
