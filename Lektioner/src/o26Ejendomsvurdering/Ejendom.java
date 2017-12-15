package o26Ejendomsvurdering;

public class Ejendom {
	private Bygning bygning;
	private Grund grund;
	
	public Ejendom(Bygning bygning, Grund grund){
		this.bygning=bygning; this.grund = grund;
	}
	public int vurdering(){
		return bygning.vurdering() + grund.vurdering();
	}
}
