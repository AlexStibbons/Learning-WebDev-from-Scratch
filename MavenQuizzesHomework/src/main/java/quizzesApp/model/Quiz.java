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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity // this means whatever this calls' instance does, it goes into the database
@Table(catalog = "showofshows", name="quiz") // this means we choose which database and which table
public class Quiz {
	
	@Id // annotating this is the id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // auto_increment
	private Long id;
	
	@Column(nullable = false) // signify that this cannot be null
	private String name;
	
	private String date; // since @entity, this is automatically recognized as coulmn with the same name
	
	@JsonIgnore // fetch type lazy not working??
	@OneToMany(mappedBy = "quiz", fetch = FetchType.LAZY, cascade = CascadeType.REFRESH) // foreign key, the questions are connected by the quiz
	private Set<Question> questions = new HashSet<Question>();

	public Quiz() {
		
	}
	
	public Quiz(Long id, String name, String date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}

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

	public Set<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Quiz [id=" + id + ", name=" + name + ", date=" + date + ", questions=" + questions + "]";
	}
	
	
}
