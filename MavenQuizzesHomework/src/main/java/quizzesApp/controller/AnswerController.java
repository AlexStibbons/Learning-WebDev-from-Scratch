package quizzesApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import quizzesApp.model.Answer;
import quizzesApp.service.AnswerService;

@RestController
public class AnswerController {

	@Autowired
	AnswerService answerService;
	
	@GetMapping("api/answers")
	public ResponseEntity<List<Answer>> findAll() {
		List<Answer> answers = answerService.findAll(); 
		return new ResponseEntity<>(answers, HttpStatus.OK); // ALWAYS RETURN DTOs
	}
	
}
