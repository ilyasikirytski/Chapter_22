package tasks.task_1;

public class CompoundExpression implements Expression {
    int left;
    int right;

    public CompoundExpression(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(String context) {
        switch (context) {
            case "=" -> {
                System.out.print(left = right);
                return true;
            }
            case "+=" -> {
                System.out.print(left += right);
                return true;
            }
            case "-=" -> {
                System.out.print(left -= right);
                return true;
            }
        }
        return false;
    }
}
