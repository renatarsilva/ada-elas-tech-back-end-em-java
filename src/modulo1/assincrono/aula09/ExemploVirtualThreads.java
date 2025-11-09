package modulo1.assincrono.aula09;

public class ExemploVirtualThreads {
    public static void main(String[] args) {
        for (int i = 0; i<100; i++){
            Thread.ofVirtual().start(() -> {
                try{
                System.out.println("Executando Thread:" + Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException e){
                    Thread.currentThread().interrupt();
            } });
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
