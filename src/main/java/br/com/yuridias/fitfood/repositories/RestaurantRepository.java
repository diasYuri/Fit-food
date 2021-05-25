package br.com.yuridias.fitfood.repositories;

import br.com.yuridias.fitfood.entities.restaurant.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
