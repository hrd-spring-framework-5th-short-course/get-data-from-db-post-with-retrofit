package com.example.getdatafromdbpostwithretrofit.response;


import com.example.getdatafromdbpostwithretrofit.models.Category;

public class ResponseSaveCate {

    private String message;

    private Category category;

    private Boolean status;

    public ResponseSaveCate() {
    }

    public ResponseSaveCate(String message, Category category, Boolean status) {
        this.message = message;
        this.category = category;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ResponseSaveCate{" +
                "message='" + message + '\'' +
                ", category=" + category +
                ", status=" + status +
                '}';
    }
}
