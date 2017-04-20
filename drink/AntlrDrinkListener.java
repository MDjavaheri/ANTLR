public class AntlrDrinkListener extends DrinkBaseListener {
    @Override
    public void enterDrink(DrinkParser.DrinkContext ctx){
        System.out.println(ctx.getText());
    }
}