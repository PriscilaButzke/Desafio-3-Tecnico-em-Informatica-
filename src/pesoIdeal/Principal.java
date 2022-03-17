
package pesoIdeal;

import java.util.Scanner;

/**
 *
 * @author Priscila Butzke
 */
public class Principal {
  
    public static void main(String[] args) {
        
    Peso p = new Peso();
    
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe sua altura: ");
    p.setAltura(ler.nextDouble());
    
    System.out.println("Informe seu peso: ");
    p.setPesoAtual(ler.nextDouble());
    
    System.out.println("Sendo:1 para masculino e 2 para feminino.\n Informe seu sexo: ");
    p.setSexo(ler.nextInt());
    
    System.out.println(p.toString());
    }
}
