package behavioralPatterns.interpreter;

public class Main {
    public static void main(String[] args) {
        Expression expression1 = new TerminalExpression("Hello");
        Expression expression2 = new TerminalExpression("World");
        Expression expression3 = new NonTerminalExpression(expression1, expression2);

        Context context = new Context("Hello World");

        expression3.interpret(context);
    }
}
