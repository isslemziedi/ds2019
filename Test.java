package ds2019;

public class Test {

	public static void main(String[] args) {
		 BoiteCourrier B = new BoiteCourrier (3);
		 Courrier c1 = new Courrier (true,"8010");
		 Lettre l1 = new Lettre (true,"8010",10.0,"A4");
		 Colis co1 = new Colis (false,"",10.0,15.0);
		 
		 B.tab[0]= c1;
		 B.tab[1]=l1;
		 B.tab[2]=co1;
		 
		 System.out.println("le montant total d'affranchissement de tous les courriers = "+String.format("%.3f", B.affranchir())+"\n");
		 
		 System.out.println("le nombre de courriers invalides : "+B.courriersInvalides()+"\n");
		 
		 System.out.println("le contenu de la boite aux courriers : ");
		 
		 B.afficher();

	}

}
