package quizzesApp.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import quizzesApp.model.Quiz;

@Component
public interface QuizRepository extends JpaRepository<Quiz, Long> {

	public List<Quiz> findByNameContains(String name);
	
	public List<Quiz> findByDateContains(String date); // this seems iffy
}
