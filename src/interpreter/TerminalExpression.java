package interpreter;

class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public void interpret(Context context) {
        if (context.getInput().contains(data)) {
            System.out.println("Terminal Expression: " + data);
        }
    }
}
