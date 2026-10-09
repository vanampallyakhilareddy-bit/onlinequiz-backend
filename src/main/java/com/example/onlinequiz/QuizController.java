package com.example.onlinequiz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class QuizController {

    @GetMapping("/api/quiz")
    public List<Map<String, String>> getQuestions() {
        return List.of(
            Map.of(
                "question", "What is Java?",
                "option1", "Programming language",
                "option2", "Operating system",
                "option3", "Browser",
                "option4", "None",
                "answer", "Programming language"
            ),
            Map.of(
                "question", "Which keyword creates a class in Java?",
                "option1", "class",
                "option2", "new",
                "option3", "void",
                "option4", "import",
                "answer", "class"
            )
        );
    }
}