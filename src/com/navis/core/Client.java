package com.navis.core;

public class Client {

    private String name;
    private String userId;

    public Client(){

    }

    public Client(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getUserId() {

        return userId;
    }

    public void setUserId(String userId) {

        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
