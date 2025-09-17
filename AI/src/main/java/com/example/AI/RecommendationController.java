package com.example.AI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api/recommendations")
public class RecommendationController {
	private final RecommendationService recommendationService;

    @Autowired
    public RecommendationController(RecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getRecommendations(@RequestParam Long userId) {
        User user = new User(userId, "John Doe"); // Replace with real user fetch logic
        List<Product> recommendedProducts = recommendationService.recommendProducts(user);
        return ResponseEntity.ok(recommendedProducts);
    }
}
