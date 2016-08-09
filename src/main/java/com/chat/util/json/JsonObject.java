package com.chat.util.json;


import com.chat.util.entity.User;

public class JsonObject {
    private String command;
    private User user;

    private String to;
    private String from;

    public JsonObject() {
    }

    JsonObject(String command, User user) {
        this.command = command;
        this.user = user;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getCommand() {
        return command;
    }

    public User getUser() {
        return user;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
