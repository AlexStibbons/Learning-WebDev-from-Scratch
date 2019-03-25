package quizzesApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import quizzesApp.model.Question;
import quizzesApp.service.QuestionService;

@RestController
public class QuestionController {
	
	@Autowired
	QuestionService questionService;
	
	@RequestMapping(value="api/questions", method = RequestMethod.GET)
	public ResponseEntity<List<Question>> findAll() {
		List<Question> questions = questionService.findAll();
		return new ResponseEntity<>(questions, HttpStatus.OK);
	}

}
