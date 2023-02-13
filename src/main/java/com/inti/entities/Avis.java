package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Avis implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAvis;
	private String commentaireAvis;
	
	
//====Relations====//	
	
	
	
//====Constructeurs====//	
	
	public Avis() {}


	public Avis(String commentaireAvis) {super();
		this.commentaireAvis = commentaireAvis;
	}


	public Avis(Long idAvis, String commentaireAvis) {
		this.idAvis = idAvis;
		this.commentaireAvis = commentaireAvis;
	}
	
	
	
//====Getters & Setters====//

	
	public Long getIdAvis() {
		return idAvis;
	}


	public void setIdAvis(Long idAvis) {
		this.idAvis = idAvis;
	}


	public String getCommentaireAvis() {
		return commentaireAvis;
	}


	public void setCommentaireAvis(String commentaireAvis) {
		this.commentaireAvis = commentaireAvis;
	}

//===toString()===//

	@Override
	public String toString() {
		return "Avis [idAvis=" + idAvis + ", commentaireAvis=" + commentaireAvis + "]";
	}
	
	

}
