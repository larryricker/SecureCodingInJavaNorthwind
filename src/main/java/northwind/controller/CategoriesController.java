package northwind.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import northwind.entity.Categories;

@Controller
public class CategoriesController {

	@RequestMapping("/categories")
	public String display(Model m) 
	{
		long categoryID  = 0l;
		String categoryName = "";
		String description = "";
		m.addAttribute("cat", new Categories(categoryID,  categoryName, description));
		return "viewcategories";
		
	}
	
	@RequestMapping("/categoriessearch")
	public String submitForm(@Valid @ModelAttribute("cat") Categories categories, BindingResult br) 
	{
		if (br.hasErrors())
		{
			return "catsearch";
		}
		else
		{
			return "catsearchresults";
		}
	}
}
