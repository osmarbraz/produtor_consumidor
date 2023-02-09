/**
 * Classe consumidora.
 * 
 * @author osmar
 */
public class Consumidor implements Runnable {

    private Compartilhado x;
    private int tempo;

    public Consumidor(Compartilhado x) {
        this.x = x;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public void run() {
        while (true) {
            try {
                //Gera um atraso aleatório com base 
                Thread.sleep((int) (Math.random() * getTempo()));
            } catch (InterruptedException e) {
            }
            x.consumir();
        }
    }
}
