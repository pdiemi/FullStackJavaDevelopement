package onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answers {

	@Id
	private int answerId;
	private String answerText;
	
	public Answers(int answerId, String answerText) {
		super();
		this.answerId = answerId;
		this.answerText = answerText;
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	@Override
	public String toString() {
		return "Answers [answerId=" + answerId + ", answerText=" + answerText + "]";
	}
	
	
}
