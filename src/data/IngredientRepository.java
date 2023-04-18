package tacos.data;

import org.springframework.stereotype.Repository;
import tacos.Ingredient;
@Repository
public interface IngredientRepository {
  Iterable<Ingredient> findAll();
  Ingredient findById(String id);
  Ingredient save(Ingredient ingredient);
} 
