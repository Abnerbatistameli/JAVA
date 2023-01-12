package Java;

import java.util.Scanner;

public class Atividades {
    public static void main(String[] args) {

        // 01 - Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o
        //      primeiro número deve ser menor que o segundo número. Caso contrário, deve ser
        //      exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa.
        //      Dentro do intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5.
        //      Veja os exemplos abaixo:

        Scanner ler = new Scanner(System.in);

        int primeiro, ultimo, contador;

        System.out.println("Digite o primeiro numero:");
        primeiro = ler.nextInt();
        System.out.println("Digite o último núnemro:");
        ultimo = ler.nextInt();

        if (primeiro<ultimo){
            for(contador=primeiro ; contador<=ultimo; contador++){
                if (contador%5==0 && contador%3==0){
                    System.out.println(contador + " é multiplo de 5 e 3");
                }

            }

        }else{
            System.out.println("Intervalo inválido!");
        }

    }

    // 02 - Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e
    //      mostre na tela quantos números são pares e quantos número são ímpares. Veja o exemplo abaixo:

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero, contador = 0, totalpar = 0, totalimpar = 0;

        for(contador=1; contador<11; contador++){
            System.out.println("Digite o numero " + contador + ":");
            numero = ler.nextInt();
            if(numero%2==0){
                totalpar = totalpar + 1;
            }else if(numero%2==1){
                totalimpar = totalimpar + 1;
            }else{
                System.out.println("Numero inválido");
            }
        }

        System.out.println("Total de números pares são " + totalpar);
        System.out.println("Total de número ímpares são " + totalimpar);

    }

    // 03- Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros),
    //      via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o
    //      total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser finalizada
    //      ao digitar uma idade negativa. Veja o exemplo abaixo:

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero = 0, contador = 0, total21 = 0, total50 = 0;

        System.out.println("\nDigite um numero negativo para finalizar o programa\n");

        while (numero>=0) {

            System.out.println("Digite uma idade:");
            numero = ler.nextInt();

            if (numero < 21 && numero>=0) {
                total21 = total21 + 1;
            } else if (numero > 50) {
                total50 = total50 + 1;
            }

        }

        System.out.println("Total de pessoas menores de 21 anos: " + total21);
        System.out.println("Total de pessoas maiores de 50 anos: " + total50);

    }
}
