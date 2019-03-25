package quizzesApp.dto;

import java.util.ArrayList;
import java.util.List;

import quizzesApp.model.Question;

public class QuestionDTO {
	
	private Long id;
	private String question;
	private int number;
	private QuizDTO quiz;
	private List<AnswerDTO> answers = new ArrayList<>();
	
	public QuestionDTO() {
		
	}
	
	public QuestionDTO(Question question) {
		this.id = question.getId();
		this.question = question.getQuestion();
		this.number = question.getNumber();
		this.quiz = new QuizDTO(question.getQuiz());
	}


	public QuestionDTO(Long id, String question, int number, QuizDTO quiz) {
		super();
		this.id = id;
		this.question = question;
		this.number = number;
		this.quiz = quiz;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public QuizDTO getQuiz() {
		return quiz;
	}

	public void setQuiz(QuizDTO quiz) {
		this.quiz = quiz;
	}

	public List<AnswerDTO> getAnswers() {
		return answers;
	}

	public void setAnswers(List<AnswerDTO> answers) {
		this.answers = answers;
	}
	
	

}
