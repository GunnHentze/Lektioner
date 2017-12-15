package o26Ejendomsvurdering;

public class Vurdering {

	public static void main(String[] args) {

		Grund grund = new ForurenetGrund(500, 500, 400000, 100000);
		System.out.println(grund.vurdering());
		((ForurenetGrund)grund).sætFradrag(150000);
		System.out.println(grund.vurdering());

	}

	public static int vurdering(Ejendom[] ejd){
		int vurd=0;
		for(int i=0; i<ejd.length; i++){
			vurd += ejd[i].vurdering();
		}
		return vurd;
	}

}
