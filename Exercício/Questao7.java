package questoes;

public class Questao7 {
    
    public static boolean positivoNegativo(int n){
        if(n > 0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        int n = -100;
        
        System.out.println(positivoNegativo(n));
    }
    
}
