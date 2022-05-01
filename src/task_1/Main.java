package task_1;

/*
Паттерн Interpreter. Создать иерархию выражений и их логического анализа
операциями «И+», «ИЛИ+», «EQUALS+», «ОТРИЦАНИЕ+», «CONTAINS+»,
«COMPARISON+», «COMPOUND+».
 */
public class Main {
    public static void main(String[] args) {
        Expression contains = new ContainsExpression("9");
        System.out.println("contains: " + contains.interpret("9 is not 8"));

        Expression equals = new EqualsExpression("1");
        System.out.println("equals: " + equals.interpret("11"));

        Expression negation = new NegationExpression("data");
        System.out.println("negation: " + negation.interpret("dat"));

        Expression orExpression = new OrExpression(new ContainsExpression("2"), new ContainsExpression("3"));
        System.out.println("or expression: " + orExpression.interpret("2,3"));

        Expression andExpression = new AndExpression(new ContainsExpression("2"), new ContainsExpression("3"));
        System.out.println("and expression: " + andExpression.interpret("2,1"));

        Expression comparisonExpression = new ComparisonExpression(500, 900);
        System.out.println("comparison: " + comparisonExpression.interpret("!="));

        Expression compoundOperator = new CompoundExpression(5, 3);
        System.out.println(" compound: " + compoundOperator.interpret("+="));
    }
}
