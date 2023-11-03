package fr.eni.quelmedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Patient {

	private String nom;
	private String prenom;
	private String numeroDeTelephone;
	private char sexe;
	private long numSecu;
	private LocalDate dateNaissance;
	private String commentaires;
	private Adresse adresse;
	

	public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numSecu,
			LocalDate dateNaissance, String commentaires, Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numeroDeTelephone = numeroDeTelephone;
		this.sexe = sexe;
		this.numSecu = numSecu;
		this.dateNaissance = dateNaissance;
		this.commentaires = commentaires;
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		var comm = commentaires;
		if (commentaires == null || commentaires.isBlank())
			comm = "[aucun commentaire]";
		return nom + " " + prenom + "\nTéléphone : " + numeroDeTelephone + "\nSexe : "
				+ (sexe == 'F' ? "Féminin" : "Masculin") + "\nNuméro de Sécurité Sociale : " 
				+ numSecu + "\nDate de naissance : " + dateNaissance 
				+ "\nCommentaires : " + comm
				+ "\nAdresse : " + adresse;
	}

	public void afficher() {
		System.out.println(nom.toUpperCase() + " " + prenom);
		System.out.println("Téléphone : " + numeroDeTelephone);
		System.out.println("Sexe : " + (sexe == 'F' ? "Féminin" : "Masculin"));
		System.out.println("Numéro de Sécurité sociale : " + numSecu);
		System.out.println("Date de naissance : " + dateNaissance.format(DateTimeFormatter.ofPattern("d MMMM yyyy")));

		var comm = commentaires;
		if (commentaires == null || commentaires.isBlank())
			comm = "[aucun commentaire]";

		System.out.println("Commentaires : " + comm);
		System.out.println(this.getAdresse().toString());
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}
