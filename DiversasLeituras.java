import java.util.Scanner;

public class DiversasLeituras {
    public static void main(String args[]){
        
        /* Declaração de variáveis */
        Scanner teclado = new Scanner(System.in);
        int codigo;
        double preco;
        String nome, texto;

        /* Leitura e Impressão  */
        System.out.println("Digite o codigo: "); /* Exibe mensagem solicitando o código */
        texto = teclado.nextLine(); /* Lê toda a linha digitada como String */
        codigo = Integer.parseInt(texto); /* Converte a String para int */

        System.out.print("Digite o nome: "); /* Exibe mensagem solicitando o nome */
        nome = teclado.nextLine(); /* Lê toda a linha digitada como String */

        System.out.print("Digite o preco: "); /* Exibe mensagem solicitando o preço */
        texto = teclado.nextLine(); /* Lê toda a linha digitada como String */
        preco = Double.parseDouble(texto); /* Converte a String para double */

        System.out.println("Voce digitou: " + codigo + " - " + nome + " R$ " + preco); /* Imprime os dados usando concatenação */

        System.out.printf("Voce digitou %d - %s R$ %.2f\n", codigo, nome, preco); /* Imprime os dados usando formatação */
    }
}