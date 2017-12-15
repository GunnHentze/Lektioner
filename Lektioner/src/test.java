
public class test {
	public static void main(String[] args){
		
		Car c = new Car("Citroen", "SV 34234", "Rød");
        Car c2 = new Car("Citroen", "SK 34233", "Blå");
        Car c3 = new Car("Citroen", "LI 23432", "Rød");
        Car c4 = new Car("Citroen", "SV 34234", "Rød");
        System.out.println(c.alike(c2));
        System.out.println(c.alike(c3));
	}
}
