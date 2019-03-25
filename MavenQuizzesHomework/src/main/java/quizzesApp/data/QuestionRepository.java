package quizzesApp.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import quizzesApp.model.Question;

@Component
public interface QuestionRepository extends JpaRepository<Question, Long>{

}
