package ATMProject.ATM;

public class MainTheEngine {
    //added throws InterruptedException to add threads/ delays
    public static void main(String[] args) throws InterruptedException {
        //constructing the first user. adding entries, or building the database using construct method
        ATM user1 = new ATM(1000, "Fatma", "ElMahdi", 3333, 1000, 5000, "15-03-2026");
        System.out.println("User Balance: " + user1.getBalance());
        user1.withdrawing(500);

        //added delay between the transaction and its after, to see the time difference.
        Thread.sleep(1000); // Wait 1 second

        user1.deposit(1000);
        Thread.sleep(2000);

        user1.deposit(300);
        Thread.sleep(1000);

        user1.withdrawing(12);
        user1.ShowBalanceMsg();
        user1.showHistory();

    }
}
