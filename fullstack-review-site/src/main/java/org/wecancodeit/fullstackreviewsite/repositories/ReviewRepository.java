package org.wecancodeit.fullstackreviewsite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.fullstackreviewsite.model.Review;

public interface ReviewRepository extends CrudRepository<Review, Long> {
}