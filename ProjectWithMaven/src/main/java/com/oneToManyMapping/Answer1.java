package com.oneToManyMapping;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Answer1 {
	
	@Id
	private int ansId;
	private String answer;
	
	@ManyToOne
	private Question1 question;
	
	
	 
	public Question1 getQuestion1() {
		return question;
	}

	public void setQuestion1(Question1 Question1) {
		this.question = Question1;
	}

	public int getAnsId() {
		return ansId;
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	


	

	public Answer1(int ansId, String answer, Question1 question) { //
		super();
		this.ansId = ansId;
		this.answer = answer;
		this.question = question;
	}

	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
