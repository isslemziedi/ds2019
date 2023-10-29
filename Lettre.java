package ds2019;

public class Lettre extends Courrier{
	private double poids;
	private String format;
	
	Lettre(boolean mode,String AdresseDes,double poids,String format){
		super(mode,AdresseDes);
		this.poids=poids;
		if((format.toUpperCase().equals("A3"))||(format.toUpperCase().equals("A4"))) {
			this.format=format.toUpperCase();
		}
		else {
			this.format="A4";
		}
	}
	
	@Override public String toString() {
		return (super.toString()+" a un poids ="+poids+", de format :'"+format+"' ");
	}
	public void decrire() {
		System.out.println(this);
	}
	
	public double affranchir() {
		double montant = 0;
		if(this.format=="A4") {
			montant = 2.50 + (0.5* this.poids);
			
		}
		if(this.format=="A3") {
			montant = 3.50 + (0.5* this.poids);
		}
		
		if(super.mode=true) {
			montant=montant*2;
		}
		return montant;
	}
	
	

}
