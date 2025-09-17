package com.example.AI;

import java.util.ArrayList;
import java.util.List;
import com.example.AI.Product;
import com.example.AI.User;

import org.springframework.stereotype.Service;

@Service
public class SimpleRecommendationService implements RecommendationService{
	 @Override
	    public List<Product> recommendProducts(User user) {
	        // Dummy recommendation logic:
	        List<Product> products = new ArrayList<>();
	        products.add(new Product(1L, "AI Book"));
	        products.add(new Product(2L, "Spring Boot Course"));
	        return products;
	 }
}
