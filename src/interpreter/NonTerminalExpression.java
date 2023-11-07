package interpreter;


class NonTerminalExpression implements Expression {
    private Expression expression1;
    private Expression expression2;

    public NonTerminalExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public void interpret(Context context) {
        expression1.interpret(context);
        expression2.interpret(context);
        System.out.println("Non-Terminal Expression");
    }
}
