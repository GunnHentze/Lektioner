package o25bBiograf;

public class TestCinema {
	public static void main(String[] args) {
		Cinema c = new Cinema(new int[]{6,5,4,3,3,7,10});
        c.booking(1, 2);
        c.booking(3, 4);
        c.release(3, 4);
        c.booking(-1, 0);
        c.booking(7, 0);
        c.booking(1, 7);
        c.booking(1, -1);
        System.out.println(c.seatsOnRow(7));
        System.out.println(c.seatsOnRow(-1));
        System.out.println(c.rowVacancies(-1));
        System.out.println(c.rowVacancies(7));
	}

}

