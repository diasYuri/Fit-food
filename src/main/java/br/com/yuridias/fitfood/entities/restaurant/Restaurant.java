package br.com.yuridias.fitfood.entities.restaurant;

import br.com.yuridias.fitfood.entities.Location;
import lombok.Data;

import java.util.List;

@Data
public class Restaurant {

    private String id;

    private String name;

    private String email;

    private Location localization;

    private List<Product> products;

}
