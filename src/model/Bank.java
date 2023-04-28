package model;

import java.io.Serializable;

public class Bank implements Serializable{
    private CurrentAccount[] accounts;

    public CurrentAccount[] getAccounts() {
        return accounts;
    }

    public void setAccounts(CurrentAccount[] accounts) {
        this.accounts = accounts;
    }

}
