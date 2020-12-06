package com.example.stackoverflowdesign;

public class Account {
    private String id;
    private String alias; // Display name
    private String name;
    private String password;
    private String email;
    private String phone;
    private String reputation;
    private boolean isResetFlag;

    public boolean resetPassword() {
        return isResetFlag;
    }

    private String getUserId() {
        return this.id;
    }

    private void setUserId(String userId) {
        this.id = userId;
    }
}
