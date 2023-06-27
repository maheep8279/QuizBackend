package com.result.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "result")
public class Result {
	private long id;
	private String name;
	private String email;
	private String quizName;
	private LocalDate date;
	private int answered;
	private int unanswered;
	private int correct;
	private int incorrect;
	private List<String> skills;
	private List<Integer> percent;
	private LocalTime startTime;
	private LocalTime endTime;
	private int totalAttempt;
	private int attempt;
	private String timeTaken;

}
