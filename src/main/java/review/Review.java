package review;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String imgUrl;
	//private Category category; //may need to change back to string? Don't forget to change everywhere else.
	private String content;
	private String date;
    
    @ManyToOne 
    private Category category;
    
    private Review() {
    }

    public Review(long id, String title, String imgUrl, String category, String content, String date) {
        this.id = id;
        this.title = title;
        this.imgUrl = imgUrl;
        //this.category = category;
        this.content = content;
    }

    public long getId() {
        return id;
    }
    
    public String getTitle() {
		return title;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public Category getCategory() {
		return category;
	}
        
    public String getContent() {
        return content;
    }

	public String getDate() {
		return date;
	}
}

