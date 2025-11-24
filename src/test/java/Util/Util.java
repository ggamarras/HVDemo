package Util;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.TimeUnit;

public class Util {
    /**
     * Pausa la ejecución por la cantidad de segundos indicada sin usar Thread.sleep().
     * Ejemplo: Util.esperarPorSegundos(19);
     *
     * @param seconds segundos a esperar
     */
    public static void esperarPorSegundos(int seconds) {
        try {
            CompletableFuture<Void> future = CompletableFuture.runAsync(
                    () -> { /* tarea vacía ejecutada después del retraso */ },
                    CompletableFuture.delayedExecutor(seconds, TimeUnit.SECONDS)
            );
            future.join();
        } catch (CompletionException e) {
            throw new RuntimeException("Error esperando por segundos", e.getCause());
        }
    }
}
