package exer008StrategyPattern;

public class PizzaNapolitana implements PizzaStrategyInterface {
    @Override
    public void preparar() {
        System.out.println("Pizza Napolitana! ");
    }    
}
