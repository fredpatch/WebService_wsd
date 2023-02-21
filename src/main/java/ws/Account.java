package ws;

import java.util.Date;

public class Account extends BankService {

    private int code;
    private double balance;
    private Date CreationDate;

    public Account() {
    }

    public Account(int code, double balance, Date creationDate) {
        this.code = code;
        this.balance = balance;
        CreationDate = creationDate;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(Date creationDate) {
        CreationDate = creationDate;
    }
}
