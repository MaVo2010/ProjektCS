package de.htwberlin.webtech.ProjektCS.web.api;

public class UserManipulationRequest {

    private String userName;
    private float userBalance;
    private boolean validated;

    public UserManipulationRequest(String userName, float userBalance, boolean validated) {
        this.userName = userName;
        this.userBalance = userBalance;
        this.validated = validated;
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

    public void setValidated(boolean Validated) {
        this.validated = validated;
    }
}
