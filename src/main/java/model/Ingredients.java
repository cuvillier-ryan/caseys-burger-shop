package model;

public interface Ingredients {

    Ingredient findById(long id);

    // We need a method to create a new burger, and return the ID (long) once it is successfully created
    long createIngredient(Ingredient ingredient);

}
