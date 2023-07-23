package com.in28minutes.jpa.hibernate.AdvancedJPA.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {

	@Id
	@GeneratedValue
	private long id;
	private float rating;
	private String desc;

	public Review() {
		super();
	}

	public Review(float rating, String desc) {
		super();
		this.rating = rating;
		this.desc = desc;
	}

	public long getId() {
		return id;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", rating=" + rating + ", desc=" + desc + "]";
	}

}
