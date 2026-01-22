import java.util.Scanner;

public class CodigoProduto {
    public static void main(String[] args) {

         /*
            Leitura de dados
            Cria objeto Scanner
        */
        Scanner teclado = new Scanner(System.in);

        
         /* Declaração de variáveis
            Tipos: int, double, String
        */
        int codigoProduto;
        double preco;
        String nome, texto;
        

         /*
            Entrada de dados
            Leitura de dados
            Parse de String para int
        */
        System.out.print("Digite o código do produto: ");
        texto = teclado.nextLine();
        codigoProduto = Integer.parseInt(texto);
        
        /* Entrada de dados */
        System.out.print("Digite o nome do produto: ");
        nome = teclado.nextLine(); 

        /* Entrada de dados */
        System.out.print("Digite o preço do produto: ");
        texto = teclado.nextLine(); 
        preco = Double.parseDouble(texto); /*Parse de String para double */
        /*Só aceita números com ponto */

        System.out.println("Você digitou " + codigoProduto + " - " + nome + " R$ " + preco); /*Imprime os dados usando concatenação */



        teclado.close(); /* Fecha o Scanner */
    }
}
