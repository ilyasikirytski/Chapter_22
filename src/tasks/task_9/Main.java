package tasks.task_9;

/*
Паттерн Chain of responsibility.
Прохождение платежа через банковскую систему сопровождается целым рядом действий:
фиксирующих, контролирующих, снимающих процент банка и прочие вычеты и действия.
Построить цепочки для различного вида платежей
(обычных, льготных, государственных, внутрибанковских)
в соответствии с предметной областью и разработать модель системы.
 */
public class Main {
    public static void main(String[] args) {
        Payment payment = new UsualPayment(Purposes.USUAL);
        Payment payment1 = new PreferentialPayment(Purposes.PREFERENTIAl);
        Payment payment2 = new BankPayment(Purposes.BANK);
        Payment payment3 = new GovermentPayment(Purposes.GOVERMENT);

        payment.setNextPayment(payment1);
        payment1.setNextPayment(payment2);
        payment2.setNextPayment(payment3);

//       here you can change purpose bu enum
        payment.makePayment(Purposes.BANK);
    }
}
