package com.inti.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "RESERVATIONS", schema = "gestion_agenceVoyage_app")
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoyageur;

	@Temporal(TemporalType.DATE)
	private Date dateReservation;
	private int nbJours;

	public Reservation() {

	}

	public Reservation(Date dateReservation, int nbJours) {
		this.dateReservation = dateReservation;
		this.nbJours = nbJours;
	}

	public Long getIdVoyageur() {
		return idVoyageur;
	}

	public void setIdVoyageur(Long idVoyageur) {
		this.idVoyageur = idVoyageur;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public int getNbJours() {
		return nbJours;
	}

	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}

	@Override
	public String toString() {
		return "Reservation [idVoyageur=" + idVoyageur + ", dateReservation=" + dateReservation + ", nbJours=" + nbJours
				+ "]";
	}

}
