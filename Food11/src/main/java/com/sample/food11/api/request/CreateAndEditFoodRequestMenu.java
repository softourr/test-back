package com.sample.food11.api.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateAndEditFoodRequestMenu {
    private String name;
    private Integer price;

}
