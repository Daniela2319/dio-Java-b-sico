package edu.dani.primeirasemana;

public class MinhaClass {
    public static void main(String[] args) {
        String primeiroNome = "Daniela";
        String segundoNome = "Velter";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do Método  " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
