package de.htwberlin.webtech.ProjektCS.persistence;

import javax.persistence.*;

@Entity(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "user_balance", nullable = false)
    private float userBalance;

    @Column(name = "is_validated")
    private Boolean validated;

    public UserEntity(String userName, float userBalance, Boolean validated) {
        this.userName = userName;
        this.userBalance = userBalance;
        this.validated = validated;
    }

    protected UserEntity() {}

    public Long getId() {
        return id;
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

    public Boolean getValidated() {
        return validated;
    }

    public void setValidated(Boolean validated) {
        this.validated = validated;
    }
}
