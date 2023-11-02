package fr.eni.quelmedecin.bo;

import java.time.LocalTime;

public class Creneau {

	LocalTime time;
	int minute;
	MedecinGeneraliste medecin;
	
	
	public Creneau(LocalTime time, int minute, MedecinGeneraliste medecin) {
		super();
		this.time = time;
		this.minute = minute;
		this.medecin = medecin;
		medecin.ajouterCreneau(this);
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public MedecinGeneraliste getMedecin() {
		return medecin;
	}
	public void setMedecin(MedecinGeneraliste medecin) {
		this.medecin = medecin;
	}
	public void afficher() {
		System.out.println("Créneaux : ");
		System.out.println(this.toString()); 
		
	}
	
	@Override
	public String toString() {
		return  time + " - " + time.plusMinutes(minute)+ " ("  + minute + " minutes) ";
	}
	
}

