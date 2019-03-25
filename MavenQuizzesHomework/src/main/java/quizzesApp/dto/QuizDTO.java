package quizzesApp.dto;

import java.util.ArrayList;
import java.util.List;

import quizzesApp.model.Question;
import quizzesApp.model.Quiz;

public class QuizDTO { //DTO not connected to anything, it only relays data, does not and cannot manipulate it in any way
	
	private Long id;
	private String name;
	private String date;
	
	private List<Question> questions = new ArrayList<>();
	
	public QuizDTO() {
		
	} // all purpose constructor
	
	public QuizDTO(Long id, String name, String date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	} // dto creation when, for ex, user creates quiz
	
	public QuizDTO(Quiz quiz) {
		super();
		this.id = quiz.getId();
		this.name = quiz.getName();
		this.date = quiz.getDate();
	} // the "real" dto

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	
	
}
