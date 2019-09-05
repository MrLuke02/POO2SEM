package questoes;

public class Questao3 {
    
    public static void calcularTempo(int segundos){
     int horas = segundos/3600;
     int minutos = segundos/60;
     
        System.out.println("O resultado é:");
        System.out.println(horas + " horas");
        System.out.println(minutos + " minutos");
        System.out.println(segundos + " Segundos");
    }
    
    
    public static void main(String[] args) {
        calcularTempo(12000);
    }
    
}
