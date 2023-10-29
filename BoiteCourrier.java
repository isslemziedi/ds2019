package ds2019;

public class BoiteCourrier {
	public Courrier tab[];
	

	BoiteCourrier(int n){
		tab= new Courrier[n];
	}
	
	public double affranchir() {
		double montant =0;
		for(int i =0;i<tab.length;i++) {
			montant+=tab[i].affranchir();
		}
		return montant;	
	}
	
	public int courriersInvalides()
	{
		int count=0;
		for(int i =0;i<tab.length;i++) {
			if(tab[i].estValide()== false) {
				count=count+1;
			}
		}
		return count;
	}
	
	public void afficher() {
		for(int i =0;i<tab.length;i++) {
			tab[i].decrire();
			if(tab[i].estValide()) {
				System.out.println("Courrier est valide");
			}
			else {
				System.out.println("Courrier est invalide");
			}
		}
		
	}
}
