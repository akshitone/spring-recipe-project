package akshitone.springtutorial.recipeproject.controllers;

import akshitone.springtutorial.recipeproject.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {
    public final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndex(Model model) {
        model.addAttribute("recipes",recipeService.getRecipes());
        log.debug("Getting index page...");
        return "index";
    }
}
