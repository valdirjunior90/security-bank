package model;

public class CurrentAccount {
    private String account;
    private Client client;
    private Double balance;

    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) {
       try {
        if (this.balance < amount) {
            throw new Exception("Insufficient funds");
        }
        
        this.balance -= amount;
       } catch (Exception e) {
        // TODO: handle exception
       }
    }
}
