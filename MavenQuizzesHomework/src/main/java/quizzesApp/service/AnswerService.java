package quizzesApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import quizzesApp.data.AnswerRepository;
import quizzesApp.model.Answer;

@Component
public class AnswerService {

	@Autowired
	AnswerRepository answerRepository;
	
	public Answer save(Answer answer) {
		return answerRepository.save(answer);
	}
	
	public void remove(Long id) {
		answerRepository.deleteById(id);
	}
	
	public List<Answer> findAll() {
		return answerRepository.findAll();
	}
	
	public Page<Answer> findAll(Pageable page) {
		return answerRepository.findAll(page);
	}
}
