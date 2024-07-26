package exer008StrategyPattern;

public class PizzaCalabresa implements PizzaStrategyInterface {

    @Override
    public void preparar() {
        System.out.println("Pizza de Calabresa! ");        
    }

}
