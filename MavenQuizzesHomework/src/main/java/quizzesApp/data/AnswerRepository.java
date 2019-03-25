package quizzesApp.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import quizzesApp.model.Answer;

@Component
public interface AnswerRepository extends JpaRepository<Answer, Long>{

}
