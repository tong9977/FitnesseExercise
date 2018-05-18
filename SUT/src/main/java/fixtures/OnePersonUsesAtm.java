package fixtures;

import atm.*;

public class OnePersonUsesAtm {

    private ATM theATM;

    public OnePersonUsesAtm() {
        Bank theBank = new Bank();
        theBank.addCustomer(new Customer(1, 111, 100));
        theBank.addCustomer(new Customer(2, 222, 200));
        theBank.addCustomer(new Customer(3, 333, 300));
        theATM = new ATM(theBank);
    }

    public boolean customerIdLoginWithPin(int cid, int pin) {
        return theATM.validateCustomer(cid, pin);
    }

    public void deposit(double value) {
        theATM.deposit(value);
    }

    public void withdraw(double value) {
        theATM.withdraw(value);
    }

    public double balance() {
        return theATM.getBalance();
    }
}
