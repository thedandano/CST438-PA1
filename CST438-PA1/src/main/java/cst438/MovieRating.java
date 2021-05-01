package cst438;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
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
  @Min(1)
  @Max(5)
  private int movieRating;

  @NotNull
  @Size(min = 1, max = 25)
  private String firstName;

  @NotNull
  @Size(min = 1, max = 25)
  private String lastName;

  private String time;

  // Constructors
  public MovieRating() {}

  public MovieRating(long id, String movieTitle, int rating, String firstName, String lastName,
      String time) {
    super();
    this.id = id;
    this.movieTitle = movieTitle;
    this.movieRating = rating;
    this.firstName = firstName;
    this.lastName = lastName;
    this.time = time;
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

  public int getMovieRating() {
    return movieRating;
  }

  public void setMovieRating(int movieRating) {
    this.movieRating = movieRating;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }



}
