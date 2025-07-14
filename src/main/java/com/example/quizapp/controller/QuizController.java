package com.example.quizapp.controller;

import com.example.quizapp.model.Questions;
import com.example.quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {
    @Autowired
    private QuizService quizService;

    @GetMapping("/questions")
    public List<Questions> getQuestions() {
        return quizService.getAllQuestions();
    }

    @PostMapping("/submit")
    public Map<String, Object> submitAnswers(@RequestBody Map<Long, Integer> answers) {
        return quizService.calculateScore(answers);
    }
}