package com.cognizant.ormlearn.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "question")
public class Question {

    @Id
    @Column(name = "qu_id")
    private int id;

    @Column(name = "qu_text")
    private String text;

    @Column(name = "qu_score")
    private double score;

    @OneToMany(mappedBy = "question")
    private Set<Option> optionList;

    @OneToMany(mappedBy = "question")
    private Set<AttemptQuestion> attemptQuestionList;

    public Question() {
    }

    public Question(int id, String text, double score,
                    Set<Option> optionList,
                    Set<AttemptQuestion> attemptQuestionList) {
        this.id = id;
        this.text = text;
        this.score = score;
        this.optionList = optionList;
        this.attemptQuestionList = attemptQuestionList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Set<Option> getOptionList() {
        return optionList;
    }

    public void setOptionList(Set<Option> optionList) {
        this.optionList = optionList;
    }

    public Set<AttemptQuestion> getAttemptQuestionList() {
        return attemptQuestionList;
    }

    public void setAttemptQuestionList(Set<AttemptQuestion> attemptQuestionList) {
        this.attemptQuestionList = attemptQuestionList;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", score=" + score +
                '}';
    }
}