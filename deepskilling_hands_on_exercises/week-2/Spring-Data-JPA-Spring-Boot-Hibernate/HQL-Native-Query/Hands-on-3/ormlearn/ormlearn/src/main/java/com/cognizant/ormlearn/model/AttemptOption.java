package com.cognizant.ormlearn.model;

import jakarta.persistence.*;

@Entity
@Table(name = "attempt_option")
public class AttemptOption {

    @Id
    @Column(name = "ao_id")
    private int id;

    @Column(name = "ao_answer")
    private boolean answer;

    @ManyToOne
    @JoinColumn(name = "aq_id")
    private AttemptQuestion attemptQuestion;

    @ManyToOne
    @JoinColumn(name = "op_id")
    private Option option;

    public AttemptOption() {
    }

    public AttemptOption(int id, boolean answer,
                         AttemptQuestion attemptQuestion,
                         Option option) {
        this.id = id;
        this.answer = answer;
        this.attemptQuestion = attemptQuestion;
        this.option = option;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public AttemptQuestion getAttemptQuestion() {
        return attemptQuestion;
    }

    public void setAttemptQuestion(AttemptQuestion attemptQuestion) {
        this.attemptQuestion = attemptQuestion;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return "AttemptOption{" +
                "id=" + id +
                ", answer=" + answer +
                '}';
    }
}