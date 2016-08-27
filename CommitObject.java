package com.reviewal.revival.models;

import java.util.Date;

/**
 * Created by Eugen on 26.08.2016.
 */
public class CommitObject {
    private String author;
    private String CID;
    private String repository;
    private Date date;
    private float mark;

    public CommitObject(String author, String CID, String repository) {
        this.author = author;
        this.CID = CID;
        this.repository = repository;
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCID() {
        return CID;
    }

    public void setCID(String CID) {
        this.CID = CID;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
}
