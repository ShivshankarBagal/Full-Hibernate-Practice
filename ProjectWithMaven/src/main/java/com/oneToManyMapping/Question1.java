package com.oneToManyMapping;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question1 {
	
	@Id
	@Column(name="Question1_id")
	private int Question1Id;
	
	private String Question1;
	
	@OneToMany(mappedBy = "question")
	private List<Answer1> Answer1s;

	

	public Question1() {
		super();
		
	}
	

	public Question1(int Question1Id, String Question1, List<Answer1> Answer1s) {
		super();
		this.Question1Id = Question1Id;
		this.Question1 = Question1;
		this.Answer1s = Answer1s;
	}


	public List<Answer1> getAnswer1s() {
		return Answer1s;
	}


	public void setAnswer1s(List<Answer1> Answer1s) {
		this.Answer1s = Answer1s;
	}


	public int getQuestion1Id() {
		return Question1Id;
	}

	public void setQuestion1Id(int Question1Id) {
		this.Question1Id = Question1Id;
	}

	public String getQuestion1() {
		return Question1;
	}

	public void setQuestion1(String Question1) {
		this.Question1 = Question1;
	}

	

	
	
}
