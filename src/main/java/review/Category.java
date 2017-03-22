package review;

import java.util.Collection;
import java.util.Collections;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;

	@OneToMany
	(mappedBy = "category",fetch = FetchType.EAGER)
	private Collection<Review> reviews;
    
	protected Category() {
	}
	public Category(long id, String name) {
		this(id, name, Collections.emptyList());
	}
	public Category(long id, String name, Collection<Review> reviews) {
		this.id = id;
		this.name = name;
		this.reviews = reviews;
	}
	@Override
	public String toString() {
		return String.format("Category[id=%d, name ='%s', reviews: %s]", 
				id, name, reviews);
	}
	
	public long getId() {
	return id;
	}

	public String getName() {
	return name;
	}

	public Collection<Review> getReviews(){
	return reviews;
	}
}
