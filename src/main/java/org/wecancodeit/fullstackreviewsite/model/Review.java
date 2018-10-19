package org.wecancodeit.fullstackreviewsite.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue
	private Long id;
<<<<<<< Updated upstream
	
=======
	private String languageName;
	private int yearCreated;
	private String reviewText;
	
	@ManyToOne
	private Category category;
	
	public Review() {}
	
	public Review(String languageName, int yearCreated, String reviewText, Category category) {
		this.languageName = languageName;
		this.yearCreated = yearCreated;
		this.reviewText = reviewText;
		this.category = category;
	}


	public Category getCategory() {
		return category;
	}
	
	public Long getId() {
		return id;
	}

	public String getLanguageName() {
		return languageName;
	}
	
	public String getReviewText() {
		return reviewText;
	}

	public int getYearCreated() {
		return yearCreated;
	}

>>>>>>> Stashed changes
}
