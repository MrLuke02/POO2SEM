
package questoes;

public class Questao4 {
               
    public static void ordenar(int n[]){
        if(n[0] > n[1] & n[1] > n[2]){
            System.out.println(n[2] + " " + n[1] + " " + n[0]);
        }else if(n[1] > n[0] & n[0] > n[2]){
            System.out.println(n[2] + " " + n[0] + " " + n[1]);   
        }else if(n[0] > n[2] & n[2] > n[1]){
            System.out.println(n[1] + " " + n[2] + " " + n[0]);
        }else if(n[2] > n[1] & n[1] > n[0]){
            System.out.println(n[0] + " " + n[1] + " " + n[2]);
        }else if(n[2] > n[0] & n[0] > n[1]){
            System.out.println(n[1] + " " + n[0] + " " + n[2]);
        }else if(n[1]> n[2] & n[2] > n[0]){
            System.out.println(n[0] + " " + n[2] + " " + n[1]);
        }
    }
    
    
    public static void main(String[] args) {
            int[] n = { 20, 12, 32};
            
            ordenar(n);

        
    }
    
}
