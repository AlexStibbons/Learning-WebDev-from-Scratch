package quizzesApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(catalog = "showofshows", name = "answer")
public class Answer {
	
	@Id // annotating this is the id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // auto_increment
	private Long id;
	
	@Column(nullable = false)
	private String answer;
	
	private boolean correct;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Question question;

	public Answer(Long id, String answer, boolean correct, Question question) {
		super();
		this.id = id;
		this.answer = answer;
		this.correct = correct;
		this.question = question;
	}

	public Answer() {
		
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

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
}
