package designpatterns.facade;

public class FundsCheck {

    private double cashInAccount = 1000.00;

    public double getCashInAccount() {
        return this.cashInAccount;
    }

    public void decreaseCashInAccount(double cash) {
        this.cashInAccount -= cash;
    }

    public void increaseCashInAccount(double cash) {
        this.cashInAccount += cash;
    }

    public boolean haveEnoughMoney(double cashToWithdraw) {
        if (cashToWithdraw > this.cashInAccount) {
            System.out.println("Don't have enough money");
            System.out.println("Current balance: " + this.cashInAccount);
            return false;
        } else {
            System.out.println("Current balance: " + this.cashInAccount);
            return true;
        }
    }

    public void makeDeposit(double cash) {
        increaseCashInAccount(cash);
        System.out.println("Deposit complete! Current balance: " + this.cashInAccount);
    }

    public void makeWithdraw(double cash) {
        decreaseCashInAccount(cash);
        System.out.println("Withdraw complete! Current balance: " + this.cashInAccount);
    }
}
