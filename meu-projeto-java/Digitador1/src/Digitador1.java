import java.util.Scanner;   // Importando a classe Scanner digita no teclado

public class Digitador1 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);       // Instanciando e criando um objeto Scanner
        
        int d1, d2;

        System.out.println("Digite o primeiro número: ");
        d1 = ler.nextInt();                        // Entrada de dados (lendo um valor inteiro)

        System.out.println("Digite o segundo número: ");
        d2 = ler.nextInt();                       // Entrada de dados (lendo o segundo valor inteiro)

        System.out.printf("%d + %d = %3d\n", d1,d2, (d1 + d2));
        System.out.printf("%d - %d = %3d\n", d1,d2, (d1 - d2));
        System.out.printf("%d * %d = %3d\n", d1,d2, (d1 * d2));
        System.out.printf("%d / %d = %3d (divisão inteiro)\n", d1,d2, (d1 / d2));
        System.out.printf("%d + %d = %6.2f(divisão exata)\n", d1,d2, ((double)  d1 / d2));
        
        
    }
}
