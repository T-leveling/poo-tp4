package fr.eni.quelmedecin.bo;

import java.time.LocalDate;

public class RendezVous {
	Creneau creneau;
	Patient patient;
	LocalDate date;
	
	public RendezVous(Creneau creneau, Patient patient, LocalDate date) {
		super();
		this.creneau = creneau;
		this.patient = patient;
		this.date = date;
	}

	public Creneau getCreneau() {
		return creneau;
	}

	public void setCreneau(Creneau creneau) {
		this.creneau = creneau;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void afficher() {
		System.out.println("Rendez-vous du " + date + " \navec le Docteur " + this.creneau.getMedecin().getNom()+ " \npour " + patient.toString());
	}
	
}
