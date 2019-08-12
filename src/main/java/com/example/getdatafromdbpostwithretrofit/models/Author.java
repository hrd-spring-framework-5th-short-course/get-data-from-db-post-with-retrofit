package com.example.getdatafromdbpostwithretrofit.models;

import com.google.gson.annotations.SerializedName;

import java.sql.Timestamp;
import java.util.List;

public class Author {

    private Integer id;
    private String name;
    private String contact;

    @SerializedName(value = "books")
    private List<Book> books;

    private Boolean status;


    private Timestamp createdAt;

    public Author() {
    }

    public Author(Integer id, String name, String contact, List<Book> books, Boolean status, Timestamp createdAt) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.books = books;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", books=" + books +
                ", status=" + status +
                ", createdAt=" + createdAt +
                '}';
    }
}
