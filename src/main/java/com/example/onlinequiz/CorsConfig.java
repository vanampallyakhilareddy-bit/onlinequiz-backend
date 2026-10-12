[7:56 pm, 12/10/2026] Akhila Reddy: const response = await fetch('https://onlinequiz-backend-1.onrender.com/api/quiz');
[8:19 pm, 12/10/2026] Akhila Reddy: package com.example.onlinequiz;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins(
                    "https://vanampallyakhilareddy-bit.github.io"
                )
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*");
    }
}
