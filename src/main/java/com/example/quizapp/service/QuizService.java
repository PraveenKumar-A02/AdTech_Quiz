package com.example.quizapp.service;

import com.example.quizapp.model.Questions;
import com.example.quizapp.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class QuizService {
    @Autowired
    private QuestionRepository questionRepository;

    public List<Questions> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Map<String, Object> calculateScore(Map<Long, Integer> answers) {
        int score = 0;
        List<Map<String, Object>> results = new ArrayList<>();
        
        for (Map.Entry<Long, Integer> entry : answers.entrySet()) {
            Questions question = questionRepository.findById(entry.getKey()).orElse(null);
            if (question != null) {
                question.setChose(entry.getValue());
                questionRepository.save(question);
                
                Map<String, Object> result = new java.util.HashMap<>();
                result.put("quesId", question.getQuesId());
                result.put("title", question.getTitle());
                result.put("optionA", question.getOptionA());
                result.put("optionB", question.getOptionB());
                result.put("optionC", question.getOptionC());
                result.put("chosenAnswer", entry.getValue());
                result.put("correctAnswer", question.getAns());
                result.put("isCorrect", question.getAns() == entry.getValue());
                
                results.add(result);
                
                if (question.getAns() == entry.getValue()) {
                    score++;
                }
            }
        }

        Map<String, Object> response = new java.util.HashMap<>();
        response.put("score", score);
        response.put("totalQuestions", answers.size());
        response.put("results", results);
        return response;
    }
}