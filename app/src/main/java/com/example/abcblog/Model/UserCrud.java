package com.example.abcblog.Model;

public class UserCrud {

    private String Fname;
    private String Lname;
    private String username;
    private String password;

    public UserCrud(String fname, String lname, String username, String password) {
        Fname = fname;
        Lname = lname;
        this.username = username;
        this.password = password;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
