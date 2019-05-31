package designpatterns.facade;

public class TestBankAccount {

    public static void main(String[] args) {

        BankAccountFacade bankAccountFacade = new BankAccountFacade(1234, 1234);

        bankAccountFacade.withDrawCash(50.00);
        bankAccountFacade.withDrawCash(10000);
        bankAccountFacade.makeDeposit(156);
    }

}
