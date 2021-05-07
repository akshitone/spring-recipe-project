package akshitone.springtutorial.recipeproject.controllers;

import akshitone.springtutorial.recipeproject.model.Category;
import akshitone.springtutorial.recipeproject.model.UnitOfMeasure;
import akshitone.springtutorial.recipeproject.repositories.CategoryRepository;
import akshitone.springtutorial.recipeproject.repositories.UnitOfMeasureRepository;
import akshitone.springtutorial.recipeproject.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    public final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndex(Model model) {
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";
    }
}
