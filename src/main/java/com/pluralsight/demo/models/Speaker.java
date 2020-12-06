package com.pluralsight.demo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity (name = "speakers")
public class Speaker {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long speaker_id;
	
	private String first_Name;
	private String last_Name;
	private String title;
	private String company;
	private String speaker_bio;
	
	@Lob //large data
	@Type(type = "org.hibernate.type.BinaryType")
	private byte[] speaker_photo;
	
	@ManyToMany(mappedBy = "speakers")
	@JsonIgnore //per evitare l'annidamento ricorrente nella costruzione del Json di risposta
	private List<Session> sessions;
	
	public List<Session> getSessions() {
		return sessions;
	}


	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}

	
	public Speaker() {
		
		//todo
	}
	
	
	public Long getSpeaker_id() {
		return speaker_id;
	}


	public void setSpeaker_id(Long speaker_id) {
		this.speaker_id = speaker_id;
	}


	public String getFirst_Name() {
		return first_Name;
	}


	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}


	public String getLast_Name() {
		return last_Name;
	}


	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getSpeaker_bio() {
		return speaker_bio;
	}


	public void setSpeaker_bio(String speaker_bio) {
		this.speaker_bio = speaker_bio;
	}

	public byte[] getSpeaker_photo() {
		return speaker_photo;
	}


	public void setSpeaker_photo(byte[] speaker_photo) {
		this.speaker_photo = speaker_photo;
	}


}
