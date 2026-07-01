package com.cognizant.ormlearn.model;

import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "attempt")
public class Attempt {

    @Id
    @Column(name = "at_id")
    private int id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "at_date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "us_id")
    private User user;

    @OneToMany(mappedBy = "attempt")
    private Set<AttemptQuestion> attemptQuestionList;

    public Attempt() {
    }

    public Attempt(int id, Date date, User user,
                   Set<AttemptQuestion> attemptQuestionList) {
        this.id = id;
        this.date = date;
        this.user = user;
        this.attemptQuestionList = attemptQuestionList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<AttemptQuestion> getAttemptQuestionList() {
        return attemptQuestionList;
    }

    public void setAttemptQuestionList(Set<AttemptQuestion> attemptQuestionList) {
        this.attemptQuestionList = attemptQuestionList;
    }

    @Override
    public String toString() {
        return "Attempt{" +
                "id=" + id +
                ", date=" + date +
                '}';
    }
}