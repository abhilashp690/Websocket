package com.example.WebSocket.Model;

public class RequestModel {
    private String userName;

    public RequestModel() {
    }

    public RequestModel(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
