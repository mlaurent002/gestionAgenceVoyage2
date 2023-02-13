package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idHotel; 
	private String nomHotel;
	private int nombreEtoiles;
	
	
//====Relations====//
	
	
	
//====Constructeurs====//
	
	
	public Hotel() {}


	public Hotel(String nomHotel, int nombreEtoiles) {
		this.nomHotel = nomHotel;
		this.nombreEtoiles = nombreEtoiles;
	}


	public Hotel(Long idHotel, String nomHotel, int nombreEtoiles) {
		this.idHotel = idHotel;
		this.nomHotel = nomHotel;
		this.nombreEtoiles = nombreEtoiles;
	}

//====Getters & Setters====//
	
	public Long getIdHotel() {
		return idHotel;
	}


	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}


	public String getNomHotel() {
		return nomHotel;
	}


	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}


	public int getNombreEtoiles() {
		return nombreEtoiles;
	}


	public void setNombreEtoiles(int nombreEtoiles) {
		this.nombreEtoiles = nombreEtoiles;
	}

//===toString()===//

	@Override
	public String toString() {
		return "Hotel [idHotel=" + idHotel + ", nomHotel=" + nomHotel + ", nombreEtoiles=" + nombreEtoiles + "]";
	}

}
