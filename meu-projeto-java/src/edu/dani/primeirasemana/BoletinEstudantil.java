package edu.dani.primeirasemana;

public class BoletinEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 10;
        if(mediaFinal < 6)
            System.out.println("Reprovado");
        else if (mediaFinal == 6)
            System.out.println("Prova Minerva");
        else 
            System.out.println("Aprovado");
    }
}
