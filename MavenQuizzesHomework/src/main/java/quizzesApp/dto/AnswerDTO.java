package quizzesApp.dto;

import quizzesApp.model.Answer;

public class AnswerDTO {
	
	private Long id;
	private String answer;
	private boolean correct;
	private QuestionDTO question;

	public AnswerDTO() {
		
	}
	
	public AnswerDTO(Long id, String answer, boolean correct, QuestionDTO question) {
		super();
		this.id = id;
		this.answer = answer;
		this.correct = correct;
		this.question = question;
	}
	
	public AnswerDTO(Answer answer) {
		this.id = answer.getId();
		this.answer = answer.getAnswer();
		this.correct = answer.isCorrect();
		this.question = new QuestionDTO(answer.getQuestion());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}

	public QuestionDTO getQuestion() {
		return question;
	}

	public void setQuestion(QuestionDTO question) {
		this.question = question;
	}
	
	
}
