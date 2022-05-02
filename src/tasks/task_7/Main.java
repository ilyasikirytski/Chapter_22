package tasks.task_7;

/*
Паттерн State. Заказ на получение гранта для обучения может находиться
в нескольких состояниях: создан, рассматривается, отложен, отклонен, подтвержден, отозван и т. д.
Определить логику изменения состояний и разработать модель системы.
 */
public class Main {
    public static void main(String[] args) {
//        name.length should be <6
        MyOrder myOrder = new MyOrder("12345");
        OrderGrant orderGrantContext = new OrderGrant();
        orderGrantContext.setState(myOrder);

        for (int i = 0; i < orderGrantContext.getCountOfStepsConsideration(); i++) {
            orderGrantContext.getStateOfOrder();
            orderGrantContext.nextState();
        }
    }
}
