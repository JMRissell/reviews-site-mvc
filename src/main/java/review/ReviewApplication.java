package review;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

	@SpringBootApplication
	public class ReviewApplication {

	    public static void main(String[] args) {
	        SpringApplication.run(ReviewApplication.class, args);
	    }
	    
	    @Resource
	    private ReviewRepository reviewRepository;
	    
	    @Resource
	    private CategoryRepository categoryRepository;

	}

