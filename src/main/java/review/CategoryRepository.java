package review;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
	
	//can add a way to sort categories if i wanted here
	//ex. 'List<Category> findByXxxXxx(String XxxXxx);
	
}
