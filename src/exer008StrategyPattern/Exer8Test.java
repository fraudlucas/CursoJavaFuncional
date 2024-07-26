package exer008StrategyPattern;

import org.junit.Test;

public class Exer8Test {

    @Test
    public void assarPizzas() {
        PizzaCalabresa calabresa = new PizzaCalabresa();
        PizzaNapolitana napolitana = new PizzaNapolitana();

        FornoContext forno = new FornoContext();

        forno.assar(napolitana);
        forno.assar(calabresa);

        forno.assar(() -> System.out.println("Pizza Lambda"));
        
    }
}
