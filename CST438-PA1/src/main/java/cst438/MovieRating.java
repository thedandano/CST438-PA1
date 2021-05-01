package cst438;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class MovieRating {

  @Id
  @GeneratedValue
  private long id;

  @NotNull
  @Size(min = 1, max = 25)
  private String movieTitle;

  @NotNull
  @Size(min = 1, max = 25)
  private String name;

  @NotNull
  @Size(min = 1, max = 5)
  private int rating;

  // Constructors
  public MovieRating(long id, String movieTitle, String name, int rating) {
    super();
    this.id = id;
    this.movieTitle = movieTitle;
    this.name = name;
    this.rating = rating;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getMovieTitle() {
    return movieTitle;
  }

  public void setMovieTitle(String movieTitle) {
    this.movieTitle = movieTitle;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }



}
