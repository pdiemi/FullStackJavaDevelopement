package manytoone;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.utility.HibernateUtility;

public class QuestionClient {

	public static void main(String args[]) {

		Session session = HibernateUtility.getSession();
		
		// Insert a new question with sample answer list to DB
		String answerText = "answer ";
		Question question = new Question(2001, "Java supports");
		for (Integer i=1001; i<=1005; i++) {
			insertAnswer(session, i, answerText.concat(i.toString()), question);
		}
		// Show all questions
		System.out.println();
		selectAllQuestion(session);
		// Show all answers
		System.out.println();
		selectAllAnswers(session);
	}

	
	public static void selectAllQuestion(Session session) {
		/*
		 * Show all Question in the DB. 
		 * Equivalent to SELECT * FROM Question
		 */
		List<Question> data = session.createQuery("from Question").list();
		System.out.println("Question list:");
		for (Question q : data)
			System.out.println(q);
	}

	public static void selectAllAnswers(Session session) {
		/*
		 * Show all Question in the DB. 
		 * Equivalent to SELECT * FROM Question
		 */
		List<Answers> data = session.createQuery("from Answers").list();
		System.out.println("Answer list:");
		for (Answers a : data)
			System.out.println(a);
	}
	
	public static void insertAnswer(Session session, int answerId, String answerText, Question question) {
		/*
		 * Insert a new Answer into DB. 
		 * Equivalent to INSERT INTO Answers
		 */
		Transaction tx = session.beginTransaction();
		Answers answer = new Answers(answerId, answerText, question);
		//session.save(questionAnswers);  // by using cascade, this line is done automatically
		session.save(answer);
		tx.commit();
		System.out.println("answer added");
	}

}
