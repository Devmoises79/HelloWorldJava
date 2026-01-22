import java.util.Scanner;

public class DiversasLeituras {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        String texto;
        System.out.println("Digite seu nome (e primeiro sobrenome): ");
        texto = teclado.nextLine();
        System.out.println("Seu nome usando nextline é: " + texto);
        System.out.println("\n");

        Scanner teclado2 = new Scanner(System.in);
        String Segundotexto;
        System.out.println("Digite seu nome (e primeiro sobrenome): ");
        Segundotexto = teclado.next();
        System.out.println("Seu nome usando next é: " + Segundotexto);

        teclado.close();
        teclado2.close();
      
    }
}
