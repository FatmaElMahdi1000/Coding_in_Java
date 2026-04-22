package AAST_AssignCh6_REVIEW;

public class Teller {

    int id;
    Customer currentCustomer;
    int RemainingTime;

    public Teller(int id) {
        this.id = id;
    }
    boolean isFree() {
        return currentCustomer == null;
    }

    void assignCustomer(Customer Cust) {
        currentCustomer = Cust;
        RemainingTime = Cust.ServiceTime;
    }
    boolean workOneUnit() {
        if (currentCustomer != null) {
            RemainingTime--;

            if (RemainingTime == 0) {
                System.out.println("Teller " + id +
                        " finished Customer " + currentCustomer.CustID);
                currentCustomer = null;
                return true;
            }
        }
        return false;
    }

}
