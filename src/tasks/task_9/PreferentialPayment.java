package tasks.task_9;

public class PreferentialPayment extends Payment {
    public PreferentialPayment(Purposes purposeOfPayment) {
        super(purposeOfPayment);
    }

    @Override
    void pay(Purposes purposeOfPayment) {
        System.out.println("Preferential class made " + purposeOfPayment + " payment");
    }
}
