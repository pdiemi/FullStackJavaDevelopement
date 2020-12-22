package onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Question {

	@Id
	private int questionId;
	private String questionText;
	
	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn (name = "question")
	private List<Answers> answers;

	public Question(int questionId, String questionText, List<Answers> answers) {
		super();
		this.questionId = questionId;
		this.questionText = questionText;
		this.answers = answers;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionText=" + questionText + ", answers=" + answers + "]";
	}
	
	
}
