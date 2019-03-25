package quizzesApp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(catalog = "showofshows", name = "question")
public class Question {
	
	@Id // annotating this is the id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // auto_increment
	private Long id;
	
	@Column(nullable = false)
	private String question;
	
	private int number;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Quiz quiz;
	
	@OneToMany(mappedBy = "question", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Set<Answer> answers = new HashSet<Answer>();
	
	public Question(String question, int number, Quiz quiz) {
		super();
		this.question = question;
		this.number = number;
		this.quiz = quiz;
	}

	public Question() {
		
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

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public Set<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}
	
	
}
