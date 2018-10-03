
package modelos;

import java.util.Random;

/**
 *
 * @author Heverton
 */
public class Baralho {
    
    private Carta[] cartas;
    //private static final int NUMERO_DE_CARTAS = 52;
    private Random aleatorio;
    private int cont = 0;
    
   
    public Baralho(){
        
        String[] faces = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] naipes = {"Copas", "Espadas","Ouros","Paus"};
        
        cartas = new Carta[52];
        aleatorio = new Random();
        

        for (String naipe : naipes) {
            for (String face : faces) {
                cartas[cont] = new Carta(face, naipe);
                cont++;
            }
        }
        cont = 0;// Zerando esse cont aqui para utilizar na distribuição de cartas.
    }
        
    public void mostrarBaralho(){
        
        System.out.println("----- APRESENTAÇÃO DO BARALHO -----");
        for (Carta carta : cartas) {
            System.out.println(carta.toString());
           
        }
    }
    
    public void embaralhar(){
        
        System.out.println("\nEmbaralhando...\n");
       
        for(int i = 0; i<cartas.length; i++){
            
            int num1 = aleatorio.nextInt(cartas.length);
            int num2 = aleatorio.nextInt(cartas.length);
            
            cartas[i] = cartas[num1];
            cartas[num1] = cartas[num2];
            cartas[num2] = cartas[i];
            
        }
        
    }
    
    public Carta[] distibruirCartas(int qtdCartas){
        
        Carta[] ctdistribuida = new Carta[qtdCartas];
        
        for (int i = 0; i < ctdistribuida.length; i++) {
            
            ctdistribuida[i] = cartas[cont];
            cont++;
            
        }
        
        return ctdistribuida;
    }
    
    public Carta[] getCartas(){
        return cartas;
    }
}
