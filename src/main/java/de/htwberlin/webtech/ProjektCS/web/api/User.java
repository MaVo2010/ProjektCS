package de.htwberlin.webtech.ProjektCS.web.api;

public class User {

    private long id;
    private String userName;
    private float userBalance;
    private boolean validated;

    public User(long id, String userName, float userBalance, boolean validated) {
        this.id = id;
        this.userName = userName;
        this.userBalance = userBalance;
        this.validated = validated;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public float getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(float userBalance) {
        this.userBalance = userBalance;
    }

    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }
}
