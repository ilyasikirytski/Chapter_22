package tasks.task_9;

abstract class Payment {
    private Purposes purposeOfPayment;
    private Payment nextPayment;

    public void setNextPayment(Payment nextPayment) {
        this.nextPayment = nextPayment;
    }

    public Payment(Purposes purposeOfPayment) {
        this.purposeOfPayment = purposeOfPayment;
    }

    public void makePayment(Purposes purposeOfPayment) {
        if (this.purposeOfPayment == purposeOfPayment) {
            pay(purposeOfPayment);
        }
        if (nextPayment != null) {
            nextPayment.makePayment(purposeOfPayment);
        }
    }

    abstract void pay(Purposes purposeOfPayment);
}
