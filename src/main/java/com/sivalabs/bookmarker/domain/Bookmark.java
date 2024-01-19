package com.sivalabs.bookmarker.domain;

import java.time.Instant;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bookmarks")
@Setter
@Getter
public class Bookmark {


	@Id
	@SequenceGenerator(name = "bm_id_seq_gen", sequenceName = "bm_id_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bm_id_seq_gen")
	private Long id;
	@Column(nullable = false)
	private String title;
	@Column(nullable = false)
	private String url;
	private Instant createdAt;
	
	public Bookmark(Long id, String title, String url, Instant createdAt) {
		this.id = id;
		this.title = title;
		this.url = url;
		this.createdAt = createdAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public Bookmark() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
