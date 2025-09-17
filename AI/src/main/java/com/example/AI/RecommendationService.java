package com.example.AI;

import java.util.List;
import com.example.AI.Product;
import com.example.AI.User;
public interface RecommendationService {
	List<Product> recommendProducts(User user);
}
