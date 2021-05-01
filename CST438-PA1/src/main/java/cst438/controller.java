package cst438;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {

  @GetMapping("/movies")
  public String controller(Model model) {

    return "index";
  }

  @PostMapping("/movies/new")
  public String processNewRating() {
    return "rating_show";
  }

  @GetMapping("movies/new")
  public String createNewRating(Model model) {

    return "rating_form";
  }

}
