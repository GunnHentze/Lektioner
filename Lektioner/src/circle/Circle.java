package circle;


public class Circle {
	private double radius;
	//Konstruktør
	public Circle(int r){
		radius = r;
	}
	//Beregner arealet
	public double areal(){
		double areal = Math.PI * Math.pow(radius, 2);
		return areal;
	}
	//Beregmer omkreds
	public double omkreds(){
		double omkreds = 2*Math.PI*radius;
		return omkreds;
	}
	//Sætter radius værdien
	public void setRadiusValue(double r){
		radius = r;
	}
	//
	public double getRadiusValue(){
		return radius;
	}
	
	public String toString(){
		String result = "Radius er: " + radius;
		return result;
	}
}

