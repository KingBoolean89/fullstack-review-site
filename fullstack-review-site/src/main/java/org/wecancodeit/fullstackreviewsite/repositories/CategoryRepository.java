package org.wecancodeit.fullstackreviewsite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.fullstackreviewsite.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
