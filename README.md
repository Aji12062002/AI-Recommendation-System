AI BASED RECOMMENDATION SYSTEM

Company: CODTECH IT SOLUTIONS

NAME: AJI KUMAR S

INTERN ID: CT04DY788

DOMAIN: JAVA PROGRAMMING

DURATION: 4 WEEKS

MENTOR: NEELA SANTHOSH KUMAR

Spring Boot Backend
The backend is built using Spring Boot, a popular Java framework for creating production-ready web applications quickly. It simplifies setup with embedded servers, auto-configuration, and easy creation of RESTful APIs — a web standard that allows clients to communicate with servers over HTTP using simple URLs and JSON data.

Key Components:
REST Controller:
The RecommendationController is annotated with @RestController and serves as the entry point for HTTP requests. It exposes an endpoint /api/recommendations which accepts a query parameter userId. When called, it creates a User object and delegates to the service layer to fetch recommended products.

Service Layer:
SimpleRecommendationService implements the interface RecommendationService. It currently returns a hardcoded list of products to simulate recommendation logic. This layer abstracts the business rules and can be easily extended to fetch real data or call Machine Learning models.

Model Classes with Lombok:
Lombok annotations such as @Data and @AllArgsConstructor are used on classes like Product and User. Lombok generates boilerplate code like getters/setters, constructors, and toString, making the code concise and readable. Spring Boot automatically serializes these Java objects to JSON when returning HTTP responses.

Data Flow:
The frontend sends an HTTP GET request to /api/recommendations?userId=1.
The controller receives this request and converts userId to a User object.
It then calls the service layer to get a list of recommended Product objects.

Frontend: Simple HTML, CSS, and JavaScript
The frontend provides a user interface that displays the recommendations in a clean, attractive layout. It’s built with:

HTML: Structures the page, containing a heading and an unordered list (<ul>) with an ID recommendations where items are dynamically inserted.

CSS:
Enhances visual appeal with a gradient background, white container cards, and stylish product cards with hover effects. It’s responsive ensuring usability on various screen sizes.

JavaScript:
Uses the Fetch API to asynchronously request the /api/recommendations endpoint. On receiving JSON, it generates list elements (<li>) with product names and appends these to the <ul>. This happens dynamically on page load, providing a smooth user experience without page reloads.The list is serialized to JSON and sent back in the HTTP response.This well-designed layered approach promotes separation of concerns, enabling easy maintenance, testing, and future integrations (e.g., database, AI models).

How it Works:
When the page loads, JS fetches data for userId=1 from the backend.The returned product list is parsed and rendered in real-time.The CSS adds interactivity and polish with animations and color effects.

Integration and Benefits
Communication between frontend and backend is stateless and decoupled through HTTP and JSON, following REST principles.The backend can be evolved independently — AI algorithms, databases, or caching can be added without affecting the frontend.The frontend remains lightweight and simple, easily replaceable or upgradable.Lombok reduces Java verbosity, improving productivity.The whole system is easy to deploy as a single Spring Boot executable JAR that can also serve static frontend assets if needed.

Summary
This project combines a modern, modular Spring Boot backend with a minimal, effective HTML/JS frontend. The backend exposes a REST API delivering structured recommendation data, while the frontend fetches and renders it dynamically with attractive styling. This architecture is scalable, maintainable, and ready for extensions like real AI models, databases, and improved UI components—all while remaining beginner-friendly and efficient.


