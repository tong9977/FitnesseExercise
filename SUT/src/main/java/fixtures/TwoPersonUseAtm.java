package fixtures;

import atm.*;
import fitnesse.slim.SystemUnderTest;

public class TwoPersonUseAtm {

    private Bank theBank;

    @SystemUnderTest
    public ATM theATM;

    public TwoPersonUseAtm() {
        theBank = new Bank();
        theATM = new ATM(theBank);
    }

    public void addCustomerIdWithPinAndBalance(int id, int pin, double balance) {
        theBank.addCustomer(new Customer(id, pin, balance));
    }
}
