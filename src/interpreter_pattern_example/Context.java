package interpreter_pattern_example;

public class Context {
    Expression evaluate(String s) {
        int pos = s.length() - 1;
        while (pos > 0) {
            if (Character.isDigit(s.charAt(pos))) {
                pos--;
            } else {
                Expression left = evaluate(s.substring(0, pos));
//                = evaluate(s.substring(pos + 1, s.length()));
//                = new NumberExpression(Integer.parseInt(s.substring(pos + 1, s.length())));
                Expression right = new NumberExpression(Integer.parseInt(s.substring(pos + 1, s.length())));
                char operator = s.charAt(pos);
                switch (operator) {
                    case '-':
                        return new MinusExpression(left, right);
                    case '+':
                        return new PlusExpression(left, right);
                }
            }
        }
        int result = Integer.parseInt(s);
        return new NumberExpression(result);
    }
}
