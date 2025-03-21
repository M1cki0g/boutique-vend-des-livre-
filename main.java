package ma.emsi.projects.biblio;

import ma.emsi.projets.magasin.Article;

public class main {
	public static void main(String[] args) {
		
		Livre livre = new Livre(1 , "Atomic habits" , 10 , 200);
		double prix =  livre.prixTTC();
		System.out.println("Le prix: "+prix);
		LivreEnfant livreenfant= new LivreEnfant(2 , "art of not giving a F" , 10 , 200 ,10,14);
        prix = livreenfant.prixTTC();	
        System.out.println("Le prix: "+prix);
        LivreScolaire livrescolaire = new LivreScolaire(3,"Math",10,200,"discipline");
        prix = livrescolaire.prixTTC();	 
        System.out.println("Le prix: "+prix);
	}
}
