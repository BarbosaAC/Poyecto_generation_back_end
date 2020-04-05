package com.generation20.proyectofinal.molde;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "publication")
public class Publication {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	@Column(nullable = false)
	public Integer idUser;
	@Column(nullable = false)
	public Integer idSport;
	@Column(length = 512, nullable = false)
	public String text;
	@Column(length = 100, nullable = false)
	public String photo;
	@Column(length = 100, nullable = false)
	public String ubication;
	@Column(length = 100, nullable = false)
	public String link;
	@Column(nullable = false)
	public int cost;
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	public Date createdAt;
	
	public Publication() {}

	public Publication(Integer id, Integer idUser, Integer idSport, String text, String photo, String ubication,
			String link, int cost, Date createdAt) {
		super();
		this.id = id;
		this.idUser = idUser;
		this.idSport = idSport;
		this.text = text;
		this.photo = photo;
		this.ubication = ubication;
		this.link = link;
		this.cost = cost;
		this.createdAt = createdAt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public Integer getIdSport() {
		return idSport;
	}

	public void setIdSport(Integer idSport) {
		this.idSport = idSport;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getUbication() {
		return ubication;
	}

	public void setUbication(String ubication) {
		this.ubication = ubication;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}	
}
