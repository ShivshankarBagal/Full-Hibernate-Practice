package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	
	@Id
	private int ansId;
	private String answer;
	
	@OneToOne(mappedBy = "answer")
	@JoinColumn(name = "question_id")
	private Question question;
	
	
	 
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
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

	


	

	public Answer(int ansId, String answer, Question question) { //
		super();
		this.ansId = ansId;
		this.answer = answer;
		this.question = question;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
