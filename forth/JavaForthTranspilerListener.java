public class JavaForthTranspilerListener extends JavaForthBaseListener {
    private String output = "";

    public JavaForthTranspilerListener() {
        super();
    }
    
   	@Override public void enterExpression(JavaForthParser.ExpressionContext ctx) {
        ExpressionContext hi = ctx;
    }

    
    @Override public void enterVariableDeclarator(JavaForthParser.VariableDeclaratorContext ctx) { }

    private Sting postFixer(String expression) {
        String operators = "[+-/\\*]";
        String[] elements; 
        while (expression.matches(operators)) {
            if (expression.matches("\\*")) {

            }
            else if (element)
            elements = expression.split();
        }
    }
}