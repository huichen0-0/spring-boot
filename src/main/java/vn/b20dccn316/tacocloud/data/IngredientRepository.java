package vn.b20dccn316.tacocloud;


import vn.b20dccn316.tacocloud.Ingredient;

public interface IngredientRepository {
  Iterable<Ingredient> findAll();
  Ingredient findById(String id);
  Ingredient save(Ingredient ingredient);
} 
