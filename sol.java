package ma.emsi.projects.biblio;

public class Livre {
protected int ISBN;
protected String titre;
protected int nbr_expl;
protected double prix;

public Livre(int ISBN , String titre , int nbr_exple , double prix) {
	this.ISBN = ISBN;
	this.titre = titre;
	this.nbr_expl = nbr_expl;
	this.prix = prix;
}

@Override
public String toString() {
	return "Livre [ISBN=" + ISBN + ", titre=" + titre + ", nbr_expl=" + nbr_expl + ", prix=" + prix + "]";
}

public double prixTTC() {
	System.out.println("Class Livre: ");
	return prix + (prix*0.2);
	
}

}

class LivreEnfant extends Livre{
private int minage;
private int maxage;
	public LivreEnfant(int ISBN, String titre, int nbr_exple, double prix,int minage,int maxage) {
		super(ISBN, titre, nbr_exple, prix);
		this.minage = minage;
		this.maxage = maxage;
	}
	@Override
	public double prixTTC() {
		System.out.println("Class LivreEnfant: ");
		return prix + (prix*0.5);
	}

	@Override
	public String toString() {
		return "LivreEnfant []";
	}
	
	public void afficher() {
		System.out.println("tranche d'ages: "+minage+" "+maxage);
	}
}

class LivreScolaire extends Livre{
private String discipline;

	public LivreScolaire(int ISBN, String titre, int nbr_exple, double prix,String discipline ) {
		super(ISBN, titre, nbr_exple, prix);
		this.discipline = discipline;
	}
@Override
public double prixTTC() {
	System.out.println("Class Livrescolaire: ");
		return prix + (prix*0.3);
	}

@Override
public String toString() {
	return "LivreScolaire [discipline=" + discipline + "]";
}
	
public void afficher() {
	System.out.println("Discipline: "+discipline);
}
}


