package cst438_1;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MovieRatingRepository extends CrudRepository<MovieRating, Long> {

  // generates a custom query
  @Query("select m from MovieRating m order by movieTitle desc, dateTime desc")
  List<MovieRating> findAllMovieRatingsOrderByTitleDateDesc();

}
