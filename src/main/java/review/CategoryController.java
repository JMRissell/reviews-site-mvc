package review;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CategoryController {
	
	@Resource
	private CategoryRepository repository;
	
	@RequestMapping("/showCategories")
    public String showCategories (Model model) {
		Iterable<Category> allCategories = repository.findAll();
    	model.addAttribute("categoriesAttribute", allCategories);
        return "categories";
    }
	
	 @RequestMapping("/showCategory")
	    public String showOne(@RequestParam (value = "id")Long id, Model model) {
	        model.addAttribute("categoryAttribute", repository.findOne(id));
	        return "category";
    }
}
