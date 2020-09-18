package model;

import java.util.ArrayList;
import java.util.List;

public class IngredientsDao implements Ingredients {
    //want to storage variable to hold all the ingredients
    private List<Ingredient> ingredients = new ArrayList<>();

    public IngredientsDao() {
        Ingredient pickels = new Ingredient();
        pickels.setId(1L);
        pickels.setName("Pickels (X3)");
        pickels.setQuantity(3);
        ingredients.add(pickels);

        //tomatoes (X2)

        Ingredient tomatoes = new Ingredient();
        tomatoes.setId(2L);
        tomatoes.setName("Tomatoes (x2)");
        tomatoes.setQuantity(2);
        ingredients.add(tomatoes);

        //cheese (x1)
        Ingredient cheese = new Ingredient();
        cheese.setId(3L);
        cheese.setName("Cheese (x1)");
        cheese.setQuantity(1);
        ingredients.add(cheese);

        //patty(x1)
        Ingredient singlePatty = new Ingredient();
        singlePatty.setId(4L);
        singlePatty.setName("Patty (x1)");
        singlePatty.setQuantity(1);
        ingredients.add(singlePatty);

        //bun(x2)
        Ingredient twoBuns = new Ingredient();
        twoBuns.setId(5L);
        twoBuns.setName("Buns (x2)");
        twoBuns.setQuantity(2);
        ingredients.add(twoBuns);

        Ingredient threeBuns = new Ingredient();
        twoBuns.setId(6L);
        twoBuns.setName("Buns (x3)");
        twoBuns.setQuantity(3);
        ingredients.add(threeBuns);

        Ingredient doublePatty = new Ingredient();
        singlePatty.setId(7L);
        singlePatty.setName("Patty (x1\2)");
        singlePatty.setQuantity(2);
        ingredients.add(doublePatty);

    }

    @Override
    public Ingredient findById(long id) {
        return ingredients.get((int) id - 1);
    }

    @Override
    public long createIngredient(Ingredient ingredient) {
        ingredient.setId(ingredients.size() + 1);

        // We need to add the passed in `Burger` object (burger) to our ArrayList
        ingredients.add(ingredient);

        // return the newly added burger's ID as a long value
        return ingredient.getId();
    }
}
