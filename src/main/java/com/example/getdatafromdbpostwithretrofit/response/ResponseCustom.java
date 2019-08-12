package com.example.getdatafromdbpostwithretrofit.response;

import com.google.gson.annotations.SerializedName;

public class ResponseCustom<T> {

    @SerializedName("data")
    private T t;
    private String message;
    private Boolean status;

    public ResponseCustom() {
    }

    public ResponseCustom(T t, String message, Boolean status) {
        this.t = t;
        this.message = message;
        this.status = status;
    }


    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ResponseCustom{" +
                "t=" + t +
                ", message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}
