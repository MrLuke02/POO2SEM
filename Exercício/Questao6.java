package questoes;

public class Questao6 {
    
    public static boolean imparPar(int n){
        if(n % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        int n = 22;
        
        System.out.println(imparPar(n));
    }
    
}
