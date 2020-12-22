package onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.utility.HibernateUtility;

public class QuestionClient {

	public static void main(String args[]) {

		Session session = HibernateUtility.getSession();
		// Create a sample answer list
		List<Answers> answerList = createSampleAnswerList();
		// Insert a new question with sample answer list to DB
		insertQuestion(session, 2001, "Java supports", answerList);
		// Show all questions
		System.out.println();
		selectAllQuestion(session);
		// Show all answers
		System.out.println();
		selectAllAnswers(session);
	}

	public static List<Answers> createSampleAnswerList(){
		Answers answer1 = new Answers(1001, "oops");
		Answers answer2 = new Answers(1002, "multi threads");
		
		List<Answers> answerList = new ArrayList<Answers>();
		answerList.add(answer1);
		answerList.add(answer2);
		
		return answerList;
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
	
	public static void insertQuestion(Session session, int questionId, String questionText, List<Answers> answerList) {
		/*
		 * Insert a new Question into DB. 
		 * Equivalent to INSERT INTO Question
		 */
		Transaction tx = session.beginTransaction();
		Question question = new Question(questionId, questionText, answerList);
		//session.save(questionAnswers);  // by using cascade, this line is done automatically
		session.save(question);
		tx.commit();
		System.out.println("question added");
	}

}
