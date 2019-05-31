package designpatterns.facade;

public class SecutiryCodeCheck {

    private int securityCode = 1234;

    public int getSecurityCode() {
        return this.securityCode;
    }

    public boolean isCodeCorrect(int secCodeToCheck) {
        return secCodeToCheck == this.securityCode;
    }
}
