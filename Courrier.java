package ds2019;

public class Courrier {
	protected boolean mode;
	protected String AdresseDes;
	protected final double TARIF=0.5 ;
	
	
	Courrier(boolean mode,String AdresseDes){
		this.mode=mode;
		this.AdresseDes=AdresseDes;
	}
	
	public boolean estValide(){
		if((this.AdresseDes!=null)&& (!this.AdresseDes.isEmpty())) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override public String toString() {
		return (this.getClass().getSimpleName()+" est de mode :'"+mode+"' , d'adresse destination :'"+AdresseDes+"' a un Tarif ="+TARIF+" ");
	}
	public void decrire() {
		System.out.println(this);
	}
	
	public double affranchir() {
		double  montant=0;
		if(estValide()) {
			if(mode==false) {
				 montant=this.TARIF;
			}
			else {
				 montant=2*this.TARIF;
			}
		}
		else {
			 montant=0;
		}
		return  montant;
	}
	
	
	

}
