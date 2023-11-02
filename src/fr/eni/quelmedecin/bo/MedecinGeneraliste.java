package fr.eni.quelmedecin.bo;

import java.util.ArrayList;

public class MedecinGeneraliste {
	private String nom;
	private String prenom;
	private String numTel;
	private static int tarif = 25;
	private Adresse adresse;
	private ArrayList<Creneau> creneaux;



	public MedecinGeneraliste(String nom, String prenom, String numTel, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.numTel = numTel;
		this.adresse = adresse;
		this.creneaux = new ArrayList<Creneau>();
	}

	public void afficher() {
		System.out.println(nom.toUpperCase() + " " + prenom);
		System.out.println("Téléphone : " + numTel);
		System.out.println("Tarif : " + tarif + "€");
		System.out.println(this.getAdresse().toString());
		for (Creneau creneau : this.creneaux) {
			System.out.println(creneau);
		}

	}
	
	public ArrayList<Creneau> getCreneaux() {
		return creneaux;
	}

	public void ajouterCreneau(Creneau creneau) {
		this.creneaux.add(creneau);
	}

	public void setNumeroDeTelephone(String numTel) {
		this.numTel = numTel;
	}

	public static void setTarif(int tarif) {
		MedecinGeneraliste.tarif = tarif;
	}

	public String getNom() {
		return nom;
	}

	public String getNumeroDeTelephone() {
		return numTel;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}
