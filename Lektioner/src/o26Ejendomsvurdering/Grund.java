package o26Ejendomsvurdering;

public class Grund {
	private int kvm, kvmp, byggeret;
	
	public Grund(int kvm, int kvmp, int byggeret){
		this.kvm=kvm; this.kvmp=kvmp; this.byggeret=byggeret;
	}
	
	public int vurdering(){
		return kvm*kvmp + byggeret;
	}
}
