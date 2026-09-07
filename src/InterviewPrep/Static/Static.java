package InterviewPrep.Static;

import AAST_AssignCh6_REVIEW.Customer;

public class Static {

    static int total = 0; //shared by all
    int custId;
    String customerName;

    public Static() {
    }

    public Static(int custId, String customerName)
    {
        this.custId = custId;
        this.customerName = customerName;
        total++; // "incorrect": "this.total" since it's ONLY ONE: total shared by all instances:
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Static.total = total;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public static void  main(String[] args)
    {

        Static customer1 = new Static(1," Fatma");
        Static customer2 = new Static(2, "Mohamed");

        //Static called by constructor
        System.out.println("Total Number Of Customers = " +  Static.getTotal());


    }
}
