package designpatterns.facade;

public class AccountNumberCheck {

    private int accountNumber = 1234;

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public boolean accountActive(int accountCheck) {
        return accountCheck == this.accountNumber;
    }
}
