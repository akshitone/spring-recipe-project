package akshitone.springtutorial.recipeproject.repositories;

import akshitone.springtutorial.recipeproject.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
