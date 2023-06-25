package com.geekster.Restaurant_Project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {

    private Integer id;

    private String name;

    private String address;

    private String specialty;

    private Integer totalStaffs;

    private Integer rating;




}
