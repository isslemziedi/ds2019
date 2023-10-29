package ds2019;

public class Colis extends Courrier {
	private double poids;
	private double volume;
	
	Colis(boolean mode,String AdresseDes,double poids,double volume){
		super(mode,AdresseDes);
		this.poids=poids;
		this.volume=volume;
	}
	
	@Override public String toString() {
		return (super.toString()+" a un poids ="+poids+", et un volume = "+volume+" ");
	}
	public void decrire() {
		System.out.println(this);
	}
	
	public double affranchir() {
		double montant = 0;
		montant = (0.25 * this.volume) + (1.0 * this.poids);
		return montant;
	}
	

}
