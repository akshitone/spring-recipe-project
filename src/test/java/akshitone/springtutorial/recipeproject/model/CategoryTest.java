package akshitone.springtutorial.recipeproject.model;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {
    Category category;

    @Before
    public void setUp() throws Exception {
        this.category = new Category();
    }

    @Test
    void getId() throws Exception {
        Long idData = 4l;
        try {
            category.setId(idData);
            assertEquals(idData, category.getId());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void getDescription() {
    }

    @Test
    void getRecipes() {
    }
}