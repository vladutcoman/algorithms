package designpatterns.facade;

public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;

    AccountNumberCheck accountNumberCheck;
    SecutiryCodeCheck secutiryCodeCheck;
    FundsCheck fundsCheck;

    WelcomeToBank welcomeToBank;

    public BankAccountFacade(int newAcctNum, int newSecCode) {
        accountNumber = newAcctNum;
        securityCode = newSecCode;

        welcomeToBank = new WelcomeToBank();
        accountNumberCheck = new AccountNumberCheck();
        secutiryCodeCheck = new SecutiryCodeCheck();
        fundsCheck = new FundsCheck();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withDrawCash(double cashToGet) {
        if (accountNumberCheck.accountActive(getAccountNumber()) &&
            secutiryCodeCheck.isCodeCorrect(getSecurityCode()) &&
            fundsCheck.haveEnoughMoney(cashToGet)) {
            fundsCheck.makeWithdraw(cashToGet);
            System.out.println("Transaction Completed!");
        } else {
            System.out.println("Transaction failed");
        }
    }

    public void makeDeposit(double cashToDeposit) {
        if (accountNumberCheck.accountActive(getAccountNumber()) &&
                secutiryCodeCheck.isCodeCorrect(getSecurityCode())) {
            fundsCheck.makeDeposit(cashToDeposit);
            System.out.println("Transaction Completed!");
        } else {
            System.out.println("Transaction failed");
        }
    }
 }
