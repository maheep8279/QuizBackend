package com.emailService.Emailservice.Model;

public class MailInfo {
    private String email;
    private String role;
    private String userName;
    private long id;

    public MailInfo(String email, String role, String userName, long id) {
        this.email = email;
        this.role = role;
        this.userName = userName;
        this.id = id;
    }

    public MailInfo() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
