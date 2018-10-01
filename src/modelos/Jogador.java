
package modelos;

/**
 *
 * @author Heverton
 */
public class Jogador {
    
    private String nome;
    private Carta[] cartas;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }
    
    public void mostrarCartas(){
        System.out.println("CARTAS DE " + nome);
        
        for(Carta i: cartas){
            i.toString();
        }
    }
   
}
