package o26Ejendomsvurdering;

public class Bygning {
	private int kvm, kvmp;
	
	public Bygning(int kvm, int kvmp){
		this.kvm=kvm;
		this.kvmp = kvmp;
	}
	
	public int vurdering(){
		return kvm*kvmp;
	}
}
