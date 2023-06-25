package com.geekster.Restaurant_Project.controller;

import com.geekster.Restaurant_Project.model.Restaurant;
import com.geekster.Restaurant_Project.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @GetMapping("getAll/restaurants")
    public List<Restaurant> getAllRestaurant(){
        return restaurantService.getAllRestaurant();
    }

    @PostMapping("add/restaurant")
    public String addRestaurant(@RequestBody Restaurant restaurant){
        return restaurantService.addRestaurant(restaurant);
    }
    @GetMapping("getRestaurant/{id}")
    public Restaurant getRestaurantById(@PathVariable Integer id){
        return restaurantService.getRestaurantById(id);
    }

    @PutMapping("update/{id}")
    public String updateSpecialtyById(@PathVariable Integer id , @RequestParam String updatedSpecialty){
        return restaurantService.UpdateSpecialtyById(id,updatedSpecialty);
    }


    @DeleteMapping("delete/{id}")
    public String deleteRestaurant(@PathVariable Integer id){
       return  restaurantService.deleteRestaurant(id);

    }







}
