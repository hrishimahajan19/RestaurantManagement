package com.geekster.Restaurant_Project.service;

import com.geekster.Restaurant_Project.model.Restaurant;
import com.geekster.Restaurant_Project.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantrepo;

    public List<Restaurant> getAllRestaurant() {
       return  restaurantrepo.AllRestaurant();
    }


    public String addRestaurant(Restaurant restaurant) {
          restaurantrepo.addRestaurant(restaurant);
          return "Restaurant Added";
    }
    public String deleteRestaurant(Integer id){
        for(Restaurant r : restaurantrepo.AllRestaurant()){
            if(r.getId().equals(id)){
                restaurantrepo.deleteRestaurant(r);

            }
        }
        return "Restaurant removed";
    }

    public Restaurant getRestaurantById(Integer id) {
        for(Restaurant r : restaurantrepo.AllRestaurant()){
            if(r.getId().equals(id)){
                return r;
            }
        }

        return null;
    }

    public String UpdateSpecialtyById(Integer id, String updatedSpecialty) {
        for(Restaurant r : restaurantrepo.AllRestaurant()){
            if(r.getId().equals(id)){
                r.setSpecialty(updatedSpecialty);
                return "Restaurant Updated";
            }
        }
        return "Restaurant Not Found";
    }
}
