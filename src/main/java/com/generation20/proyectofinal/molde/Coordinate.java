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

@Entity
@Table(name = "coordinate")
public class Coordinate {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer id;
	public Integer idRoute;
	public Integer numberPoint;
	@Column(nullable = false)
	public float latitude;
	@Column(nullable = false)
	public float longitude;
	@Temporal(TemporalType.TIMESTAMP)
	public Date createdAt;
	
	public Coordinate() {}

	public Coordinate(Integer id, Integer idRoute, Integer numberPoint, float latitude, float longitude, Date createdAt) {
		super();
		this.id = id;
		this.idRoute = idRoute;
		this.numberPoint = numberPoint;
		this.latitude = latitude;
		this.longitude = longitude;
		this.createdAt = createdAt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdRoute() {
		return idRoute;
	}

	public void setIdRoute(Integer idRoute) {
		this.idRoute = idRoute;
	}

	public int getnumberPoint() {
		return numberPoint;
	}

	public void setnumberPoint(Integer numberPoint) {
		this.numberPoint = numberPoint;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}
