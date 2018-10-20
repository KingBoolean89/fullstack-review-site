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
		Category scriptingLanguages = new Category("Scripting Languages", "Programming languages that support special run-time environment programs that automate the execution of tasks. Scripting languages are interpreted by programs, not compiled.");
		Category objectOrientedLanguages = new Category("Object-Oriented Languages", "Programming languages made to be used with the object-oriented programming paradigm, focusing on creating object-class instances to be modified and interpreted.");
		Category functionalLanguages = new Category("Shitty Languages", "Programming languages that are designed to handle symbolic computation and list processing applications. These languages are based on mathematical functions. Subsequently, they are also hell.");
		
		scriptingLanguages = categoryRepo.save(scriptingLanguages);
		objectOrientedLanguages = categoryRepo.save(objectOrientedLanguages);
		functionalLanguages = categoryRepo.save(functionalLanguages);
		
		Review html = new Review("HTML", 1990, "Placeholder", scriptingLanguages, 9L, 5L);
		Review tads = new Review("TADS", 1988, "Placeholder", scriptingLanguages, 10L, 4L);
		Review cPlusPlus = new Review("C++", 1983, "Placeholder", objectOrientedLanguages, 5L, 9L);
		Review java = new Review("Java", 1996, "Placeholder", objectOrientedLanguages, 6L, 9L);
		Review python = new Review("Python", 1989, "Placeholder", objectOrientedLanguages, 7L, 8L);
		Review haskell = new Review("Haskell", 1990, "Placeholder", functionalLanguages, 3L, 10L);
		
		html = reviewRepo.save(html);
		tads = reviewRepo.save(tads);
		cPlusPlus = reviewRepo.save(cPlusPlus);
		java = reviewRepo.save(java);
		python = reviewRepo.save(python);
		haskell = reviewRepo.save(haskell);
	}
}
