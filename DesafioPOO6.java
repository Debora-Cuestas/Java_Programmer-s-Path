
package desafiopoo6;


public class DesafioPOO6 {

    public static void main(String[] args) {
    String frase="Cherry Bomb";
    System.out.println (frase);
    String frase2="Welcome to the Jungle";
    System.out.println(frase2);
    
    String palabraRecortada=frase.substring(6);
    System.out.println("Palabra recortada= "+palabraRecortada);
    String palabraRecortada2=frase2.substring(0,8);
    System.out.println("Palabra recortada= "+palabraRecortada2);
    
        String Espacio= (" ");
        String Respuesta = palabraRecortada + Espacio + palabraRecortada2;
        System.out.println("Respuesta ="+Respuesta);
    
}
    }
