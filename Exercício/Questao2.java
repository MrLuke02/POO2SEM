
package questoes;
public class Questao2 {
    
    public static int somaVetor(int[] vetor){
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
    
        }
     return soma;
    }
    
    
    public static void main(String[] args) {
        int[] vetor = {43, 11, 53, 13, 23};
        System.out.println(somaVetor(vetor));
        
    }
    
}
