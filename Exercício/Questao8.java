
package questoes;

public class Questao8 {
    
    public static void tipoTriangulo(int x, int y, int z){
        if(x == y && y==z && z==x){
            System.out.println("Triangulo equilátero");
        }else if(x != y && y != z && z != x){
            System.out.println("Triangulo Escaleno");
        }
    }
    
    public static void main(String[] args) {
        int x = 8;
        int y = 8;
        int z = 8;
        
        tipoTriangulo(x,y,z);
    }
    
}
