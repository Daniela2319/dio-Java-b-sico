import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        String nome; 
        String sobrenome; 
        int idade; 
        double altura;
        
        System.out.println("Digite seu Nome: ");
        nome = entrada.next();

        System.out.println("Digite seu Sobrenome: ");
        sobrenome = entrada.next();

        System.out.println("Digite sua Idade: ");
        idade = entrada.nextInt();

        System.out.println("Digite sua Altura ");
        altura = entrada.nextDouble();
        
        

        System.out.println("Ola me chamo  " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é: " + altura + " cm");
    }
}
