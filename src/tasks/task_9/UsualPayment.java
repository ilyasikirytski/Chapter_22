package tasks.task_9;

public class UsualPayment extends Payment {
    public UsualPayment(Purposes purposeOfPayment) {
        super(purposeOfPayment);
    }

    @Override
    void pay(Purposes purposeOfPayment) {
        System.out.println("Usual class made " + purposeOfPayment + " payment");
    }
}
