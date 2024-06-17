package com.MyFood.FoodZip.requests;

import java.util.List;


import lombok.Data;

@Data
public class AddCartItemRequest {
	
	private Long menuItemId;
	private int quantity;
	private List<String> ingredients;

}
