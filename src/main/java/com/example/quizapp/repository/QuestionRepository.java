package com.example.quizapp.repository;

import com.example.quizapp.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Questions, Long> {
}