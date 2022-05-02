package tasks.task_9;

public class BankPayment extends Payment {
    public BankPayment(Purposes purposeOfPayment) {
        super(purposeOfPayment);
    }

    @Override
    void pay(Purposes purposeOfPayment) {
        System.out.println("Bank class made " + purposeOfPayment + " payment");
    }
}
