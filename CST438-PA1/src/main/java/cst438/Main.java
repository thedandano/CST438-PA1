package cst438;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Main {

  @Autowired
  MovieRatingRepository movieRatingRepository;

  @GetMapping("/")
  public String controller(Model model) {

    return "index";
  }

  /**
   * Handles the post request by processing the filled new Rating form.
   * 
   * @param model
   * @return
   */
  @PostMapping("/movies/new")
  public String processNewRating(@Valid MovieRating movieRating, BindingResult result,
      Model model) {
    // Error handling
    if (result.hasErrors())
      return "movie_rating_form";

    movieRating.setTime(new java.util.Date().toString());
    movieRatingRepository.save(movieRating); // saves rating obj to db
    return "movie_rating_show";
  }

  /**
   * Handles the request to display the movieRating form.
   * 
   * @param model
   * @return Returns the movie_rating_form page to the browser
   */
  @GetMapping("/movies/new")
  public String createNewRating(Model model) {
    MovieRating movieRating = new MovieRating();
    model.addAttribute("movieRating", movieRating);
    return "movie_rating_form";
  }

  /**
   * Handles the request to display all movie ratings
   * 
   * @param model
   * @return the movie_rating_list page.
   */
  @GetMapping("/movies")
  public String showMovies(Model model) {
    Iterable<MovieRating> movieRatings = movieRatingRepository.findAll();
    model.addAttribute("movieRatings", movieRatings);
    return "movie_rating_list";
  }

}
