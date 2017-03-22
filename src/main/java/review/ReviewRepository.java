package review;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Long>{
	Set<Review> findAll();
//	Map<Long, Review> reviewMap = new HashMap<Long, Review>();
//	
//	ReviewRepository() {
//	Review review1 = new Review(1L, "Overwatch", "/images/overwatch-logo.png", "Game", "FPS Moba", "3/11/217");
//	Review review2 = new Review(2L, "Witcher 3", "/images/witcher-logo.jpg", "Game", "Single-Player RPG", "3/11/2017");
//	Review review3 = new Review(3L, "Tetris", "/images/tetris-logo.jpg", "Game", "Puzzle", "3/11/2017");
//	reviewMap.put(1L, review1);
//	reviewMap.put(2L, review2);
//	reviewMap.put(3L, review3);
//	}
//	
//	public Collection<Review> findAll() {
//		Collection<Review> reviewSet = reviewMap.values();
//		return reviewSet;
//	}
//	
//	public Review findOne(long id) {
//		Review reviewValue = reviewMap.get(id); //should return specific review with specific id
//		return reviewValue;
//	}
}
