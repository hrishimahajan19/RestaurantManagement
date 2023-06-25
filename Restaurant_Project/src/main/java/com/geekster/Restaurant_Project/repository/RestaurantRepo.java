package com.geekster.Restaurant_Project.repository;

import com.geekster.Restaurant_Project.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class RestaurantRepo {

    List<Restaurant> restaurantList;
    public RestaurantRepo(){
        restaurantList = new ArrayList<>();
    }



    public List<Restaurant> AllRestaurant(){
        return restaurantList;
    }
    public void addRestaurant(Restaurant restaurant){
        restaurantList.add(restaurant);
    }
    public void deleteRestaurant(Restaurant restaurant){
        restaurantList.remove(restaurant);
    }



}
