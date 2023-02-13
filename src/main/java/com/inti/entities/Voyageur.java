package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Voyageur implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoyageur;
	private String nomVoyageur;
	private String prenomVoyageur;
	private int age;

	//====Relations====//
	
	//====Constructeurs====//	
	public Voyageur() {
	}

	public Voyageur(String nomVoyageur, String prenomVoyageur, int age) {
		this.nomVoyageur = nomVoyageur;
		this.prenomVoyageur = prenomVoyageur;
		this.age = age;
	}
	
	//====Getters & Setters====//
	public Long getIdVoyageur() {
		return idVoyageur;
	}

	public void setIdVoyageur(Long idVoyageur) {
		this.idVoyageur = idVoyageur;
	}

	public String getNomVoyageur() {
		return nomVoyageur;
	}

	public void setNomVoyageur(String nomVoyageur) {
		this.nomVoyageur = nomVoyageur;
	}

	public String getPrenomVoyageur() {
		return prenomVoyageur;
	}

	public void setPrenomVoyageur(String prenomVoyageur) {
		this.prenomVoyageur = prenomVoyageur;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	//===toString()===//
	@Override
	public String toString() {
		return "Voyageur [idVoyageur=" + idVoyageur + ", nomVoyageur=" + nomVoyageur + ", prenomVoyageur="
				+ prenomVoyageur + ", age=" + age + "]";
	}	
}
