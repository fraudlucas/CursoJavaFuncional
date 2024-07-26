package exer013;

import org.junit.Test;

public class Exer13 {

    @Test
    public void ponteirosFuncionais() {
        Runnable runnable1 = () -> System.out.println("Executando uma thread");
        Runnable runnable2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("tick " + i);
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        
        thread1.start();
        thread2.start();

        new Thread(() -> System.out.println("Executando uma nova Thread.")).start();
}
}
