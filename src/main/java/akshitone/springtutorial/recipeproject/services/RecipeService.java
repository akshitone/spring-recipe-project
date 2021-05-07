package akshitone.springtutorial.recipeproject.services;

import akshitone.springtutorial.recipeproject.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface RecipeService {
    Set<Recipe> getRecipes();
}
