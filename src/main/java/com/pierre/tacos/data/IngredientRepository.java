package com.pierre.tacos.data;

import org.springframework.data.repository.CrudRepository;

import com.pierre.tacos.Ingredient;

public interface IngredientRepository
         extends CrudRepository<Ingredient, String> {

}
