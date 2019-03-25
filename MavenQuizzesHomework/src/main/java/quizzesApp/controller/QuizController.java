package quizzesApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import quizzesApp.model.Quiz;
import quizzesApp.service.QuizService;

@RestController // signify this is a controller
public class QuizController {
	
	@Autowired // don't forget to inject service
	QuizService quizService;
	
	// GET all quizes - @requestmapping
	@GetMapping("api/quizes")
	public ResponseEntity<List<Quiz>> findAll() {
		List<Quiz> quizes = quizService.findAll();
		return new ResponseEntity<>(quizes, HttpStatus.OK);
	}
	 
	// GET one quiz - @getmapping
	@GetMapping("api/quizes/{quizId}")
	public ResponseEntity<Quiz> findById(@PathVariable Long quizId) {
		
		Quiz found = quizService.findById(quizId);
		
		if (found != null) {		
			return new ResponseEntity<>(found, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	// GET find by name - @request
	
	// GET find by date, though it won't work properly
	
	// PUT update quiz - @request
	
	// POST create quiz - @postmapping
}
