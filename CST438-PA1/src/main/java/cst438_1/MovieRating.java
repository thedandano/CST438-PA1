package cst438;

import java.util.Date;
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

  private Date dateTime;

  // Constructors
  public MovieRating() {}

  public MovieRating(long id, String movieTitle, int movieRating, String firstName, String lastName,
      Date dateTime) {
    super();
    this.id = id;
    this.movieTitle = movieTitle;
    this.movieRating = movieRating;
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateTime = dateTime;
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

  public Date getDateTime() {
    return dateTime;
  }

  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
  }


}
