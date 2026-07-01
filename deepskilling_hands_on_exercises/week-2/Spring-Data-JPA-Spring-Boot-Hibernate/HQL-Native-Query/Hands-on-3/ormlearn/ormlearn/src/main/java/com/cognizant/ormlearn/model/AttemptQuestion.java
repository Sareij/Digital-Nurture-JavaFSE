package com.cognizant.ormlearn.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "attempt_question")
public class AttemptQuestion {

    @Id
    @Column(name = "aq_id")
    private int id;

    @Column(name = "aq_score")
    private double score;

    @ManyToOne
    @JoinColumn(name = "at_id")
    private Attempt attempt;

    @ManyToOne
    @JoinColumn(name = "qu_id")
    private Question question;

    @OneToMany(mappedBy = "attemptQuestion")
    private Set<AttemptOption> attemptOptionList;

    public AttemptQuestion() {
    }

    public AttemptQuestion(int id, double score, Attempt attempt,
                           Question question,
                           Set<AttemptOption> attemptOptionList) {
        this.id = id;
        this.score = score;
        this.attempt = attempt;
        this.question = question;
        this.attemptOptionList = attemptOptionList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Attempt getAttempt() {
        return attempt;
    }

    public void setAttempt(Attempt attempt) {
        this.attempt = attempt;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Set<AttemptOption> getAttemptOptionList() {
        return attemptOptionList;
    }

    public void setAttemptOptionList(Set<AttemptOption> attemptOptionList) {
        this.attemptOptionList = attemptOptionList;
    }

    @Override
    public String toString() {
        return "AttemptQuestion{" +
                "id=" + id +
                ", score=" + score +
                '}';
    }
}