package com.bitfest_preli.challenge_2.repository;

import com.bitfest_preli.challenge_2.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
    Optional<Ingredient> findByName(String name);

    List<Ingredient> findByQuantityGreaterThan(double quantity);
}
