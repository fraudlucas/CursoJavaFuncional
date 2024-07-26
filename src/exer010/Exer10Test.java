package exer010;

import org.junit.Test;

public class Exer10Test {

    public void calcular(Calculo calculo) {
        System.out.println(calculo.operar(10, 5));
    }

    @Test
    public void calculoLambda() {
        calcular((num1, num2) -> num1 + num2);
        calcular((n1, n2) -> n1 * n2);
        calcular((Integer numero1, Integer numero2) -> numero1 / numero2);

        calcular((v1, v2) -> {
            return v1 - v2;
        });
    }

}
