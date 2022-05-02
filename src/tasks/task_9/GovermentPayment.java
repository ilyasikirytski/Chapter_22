package tasks.task_9;

public class GovermentPayment extends Payment {
    public GovermentPayment(Purposes purposeOfPayment) {
        super(purposeOfPayment);
    }

    @Override
    void pay(Purposes purposeOfPayment) {
        System.out.println("Goverment class made " + purposeOfPayment + " payment");
    }
}
