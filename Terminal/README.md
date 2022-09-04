## SCANNER

A classe `Scanner` permite que o usuário tenha um interação mais assertiva com nosso programa.

Um scanner de texto simples que pode analisar tipos primitivos e strings usando expressões regulares.
A Scanner quebra sua entrada em tokens usando um padrão delimitador, que por padrão corresponde a espaços em branco. Os tokens resultantes podem então ser convertidos em valores de diferentes tipos usando os vários métodos a seguir .

Por exemplo, este código permite que um usuário leia um número de System.in :

     Scanner sc = new Scanner(System.in);
     int i = sc.nextInt();


