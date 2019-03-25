package quizzesApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import quizzesApp.data.QuestionRepository;
import quizzesApp.model.Question;

@Component
public class QuestionService {

	@Autowired
	QuestionRepository questionRepository;
	
	public List<Question> findAll() {
		return questionRepository.findAll();
	}
	
	public Page<Question> findAll(Pageable page) {
		return questionRepository.findAll(page);
	}
	
	public Question save(Question question) {
		return questionRepository.save(question);
	}
	
	public void remove(Long id) {
		questionRepository.deleteById(id);
	}
}
