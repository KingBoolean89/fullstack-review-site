package org.wecancodeit.fullstackreviewsite.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue
	private Long id;
	private String categoryName;
	@Lob
	private String categoryDescription;
	
	@OneToMany(mappedBy="category")
	private Collection<Review> reviews;
	
	public Category() {}
	
	public Category(String categoryName, String categoryDescription) {
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
	}
	
	public String getCategoryDescription() {
		return categoryDescription;
	}
	
	public String getCategoryName() {
		return categoryName;
	}

	public Long getId() {
		return id;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}

	@Override
	public String toString() {
		return categoryName;
	}
}
