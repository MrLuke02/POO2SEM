
package questoes;

import java.util.Scanner;

public class Questao1 {
    
    
    public static double calcularMedia(double n1, double n2, double n3){
double media = (n1+n2+n3)/3;
return media;
}
    
    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            
        System.out.println("Digite 3 notas");
        
        double n1 = teclado.nextInt();
        double n2 = teclado.nextInt();
        double n3 = teclado.nextInt();
        
        System.out.println("Sua média é " + calcularMedia(n1, n2, n3));
        
    }
    
    
    
}
