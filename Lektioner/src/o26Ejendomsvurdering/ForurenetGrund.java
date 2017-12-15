package o26Ejendomsvurdering;

public class ForurenetGrund extends Grund {

	private int fradrag;
	
	public ForurenetGrund(int kvm, int kvmp, int byggeret, int fradrag) {
		super(kvm, kvmp, byggeret);
		// TODO Auto-generated constructor stub
		this.fradrag = fradrag;
	}
	
	public void sætFradrag(int fradrag){
		this.fradrag = fradrag;
	}
	
	public int vurdering(){
		return super.vurdering()-fradrag;
	}

}
