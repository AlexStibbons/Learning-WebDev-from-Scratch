package quizzesApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import quizzesApp.data.QuizRepository;
import quizzesApp.model.Quiz;

@Component // is a needed component
public class QuizService {
	
	@Autowired // dependency injection - needs repo to operate
	QuizRepository quizRepository;
	
	public Quiz save(Quiz quiz) {
		return quizRepository.save(quiz);
	}
	
	public void remove(Long id) {
		quizRepository.deleteById(id);
	}
	
	public List<Quiz> findAll() {
		return quizRepository.findAll();
	}
	
	public Page<Quiz> findAll(Pageable page) { // remember pages are a thing
		return quizRepository.findAll(page);
	}
	
	public Quiz findById(Long id) {
		return quizRepository.findById(id).get(); // adding get() bc optional
	}
	
	public List<Quiz> findByNameContains(String name) {
		return quizRepository.findByNameContains(name);
	}
	
	public List<Quiz> findByDateContains(String date) {
		return quizRepository.findByDateContains(date);
	}
	
	
	
	

}
