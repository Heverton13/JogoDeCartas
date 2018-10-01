
package modelos;

import java.util.Scanner;

/**
 *
 * @author Heverton
 */
public class Jogo {
    
    private Scanner entrada;
    private Baralho baralho;
    private Jogador[] jogadores;
    
    public Jogo(){
        
        Baralho b = new Baralho();
        b.mostrarBaralho();
        b.embaralhar();
        b.mostrarBaralho();
        
        entrada = new Scanner(System.in);
        
    }
    public void iniciarJogo(){
        
        System.out.println("Quantos jogadores iram participar do jogo?");
        System.out.println("OBS: São permitidos apenas 7 jogadores!");
        int qtdJogadores = entrada.nextInt();
        
        jogadores = new Jogador[qtdJogadores];
        
        for (int i = 0; i < jogadores.length; i++) {
            System.out.println("Digite o nome do jogador " + (i+1));   
            jogadores[i] = new Jogador(entrada.next());
        }
        
    }
    
    public void distribuirCartas(int qtd){
        
        for (Jogador i : jogadores) {
            
           //i.setCartas(cartas[qtdCartas]);
            
        }
        
    }
    
    public void mostrarCartas(){
        
        for (Jogador j : jogadores) {
            j.mostrarCartas();
        }
  
    }
    
    public static void main(String[] args) {
        
        Jogo j1 = new Jogo();
        j1.iniciarJogo();
        j1.distribuirCartas(7);
        j1.mostrarCartas();
        
    }
    
}
