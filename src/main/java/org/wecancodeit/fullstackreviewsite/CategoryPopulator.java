package org.wecancodeit.fullstackreviewsite;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.fullstackreviewsite.model.Category;
import org.wecancodeit.fullstackreviewsite.model.Review;
import org.wecancodeit.fullstackreviewsite.repositories.CategoryRepository;
import org.wecancodeit.fullstackreviewsite.repositories.ReviewRepository;

@Service
public class CategoryPopulator implements CommandLineRunner {

	@Resource
	CategoryRepository categoryRepo;
	
	@Resource
	ReviewRepository reviewRepo;

	@Override
	public void run(String... args) throws Exception {
		Category scriptingLanguages = new Category("Scripting Languages");
		Category objectOrientedLanguages = new Category("Object-Oriented Languages");
		Category functionalLanguages = new Category("Shitty Languages");
		
		scriptingLanguages = categoryRepo.save(scriptingLanguages);
		objectOrientedLanguages = categoryRepo.save(objectOrientedLanguages);
		functionalLanguages = categoryRepo.save(functionalLanguages);
		
		Review python = new Review("Python", 1989, "Placeholder", objectOrientedLanguages);
		Review haskell = new Review("Haskell", 1990, "Placeholder", functionalLanguages);
		Review html = new Review("HTML", 1990, "Placeholder", scriptingLanguages);
		Review java = new Review("Java", 1996, "Placeholder", objectOrientedLanguages);
		Review cPlusPlus = new Review("C++", 1983, "Placeholder", objectOrientedLanguages);
		
		python = reviewRepo.save(python);
		haskell = reviewRepo.save(haskell);
		html = reviewRepo.save(html);
		java = reviewRepo.save(java);
		cPlusPlus = reviewRepo.save(cPlusPlus);
	}
}
