public class HelloWorldDrink {
    public HelloWorldDrink() {

    }

    private void printDrink(String drinkSentence) {
        // Get our lexer
        DrinkLexer lexer = new DrinkLexer(new ANTLRInputStream(drinkSentence));
    
        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
    
        // Pass the tokens to the parser
        DrinkParser parser = new DrinkParser(tokens);
    
        // Specify our entry point
        DrinkSentenceContext drinkSentenceContext = parser.drinkSentence();
    
        // Walk it and attach our listener
        ParseTreeWalker walker = new ParseTreeWalker();
        AntlrDrinkListener listener = new AntlrDrinkListener();
        walker.walk(listener, drinkSentenceContext);
    }
}