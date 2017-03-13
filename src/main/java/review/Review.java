package review;

public class Review {
	public Long id;
	public String title;
	public String imgURL;
	public String reviewCategory;
    public String content;
    public String date;

    public Review(long id, String title, String imgURL, String reviewCategory, String content, String date) {
        this.id = id;
        this.title = title;
        this.imgURL = imgURL;
        this.reviewCategory = reviewCategory;
        this.content = content;
    }

    public long getId() {
        return id;
    }
    
    public String getTitle() {
		return title;
	}

	public String getImgURL() {
		return imgURL;
	}

	public String getReviewCategory() {
		return reviewCategory;
	}
        
    public String getContent() {
        return content;
    }
    
    public String getDate() {
        return date;
    }
}

