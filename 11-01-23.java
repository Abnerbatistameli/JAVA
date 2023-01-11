package Java;

import java.util.Scanner;

public class Atividades {

    public static void main(String[] args) {

        // 01 - Faça um algoritmo em Java que leia 3 valores int A, B e C e
        //      imprima na tela se a soma de A + B é maior, menor ou igual a C.

        Scanner ler = new Scanner(System.in);
        int A, B, C;

        System.out.println("\nDigite os valores referentes a 'A','B' e 'C' abaixo para receber o resultado se a soma de A + B é maior, menor ou igual a C.");
        System.out.println("Digite o valor de A: ");
        A = ler.nextInt();
        System.out.println("Digite o valor de B: ");
        B = ler.nextInt();
        System.out.println("Digite o valor de C: ");
        C = ler.nextInt();

        if (A+B>C){
            System.out.println("A soma de A + B é maior que C.");
        }else if (A+B<C){
            System.out.println("A soma de A + B é menor que C.");
        }else if (A+B==C){
            System.out.println("A soma de A + B é igual C.");
        }else{
            System.out.println("Número inválido");
        }


    }

    public static void main(String[] args) {

        // 03 - Com base na tabela abaixo, escreva um algoritmo em Java que
        //      leia o código de um item (número inteiro de 1 a 6) e a quantidade
        //      comprada deste item (número inteiro). A seguir, mostre na tela o valor
        //      total da conta e nome do produto que foi comprado.

        Scanner ler = new Scanner(System.in);

        int codigo, quantidade;

        System.out.println("---------------------MENU-------------------------\n");
        System.out.println("Código             Produto              Preço");
        System.out.println("  1            Cachorro-quente         R$10,00");
        System.out.println("  2            X-Salada                R$15,00");
        System.out.println("  3            X-Bacon                 R$18,00");
        System.out.println("  4            Bauru                   R$12,00");
        System.out.println("  5            Refrigerante            R$8,00");
        System.out.println("  6            Suco de laranja         R$13,00");
        System.out.println("\nDigite o código relacionado ao seu produto: ");
        codigo = ler.nextInt();
        System.out.println("Digite a quantidade que deseja deste produto: ");
        quantidade = ler.nextInt();


        switch (codigo) {
            case 1:
                System.out.println("Produto: Cachorro-quente");
                System.out.println("Valor total: R$" + quantidade*10.00);
                break;

            case 2:
                System.out.println("Produto: X-Salada");
                System.out.println("Valor total: R$" + quantidade*15.00);
                break;

            case 3:
                System.out.println("Produto: X-Bacon");
                System.out.println("Valor total: R$" + quantidade*18.00);
                break;

            case 4:
                System.out.println("Produto: Bauru");
                System.out.println("Valor total: R$" + quantidade*12.00);
                break;

            case 5:
                System.out.println("Produto: Refrigerante");
                System.out.println("Valor total: R$" + quantidade*8.00);
                break;

            case 6:
                System.out.println("Produto: Suco de laranja");
                System.out.println("Valor total: R$" + quantidade*13.00);
                break;

        }

        public static void main(String[] args) {

            // 04 - Escreva um algoritmo em Java, que leia a idade de uma pessoa
            //      (número inteiro) e apresente na tela se a pessoa está ou não apta
            //      a votar e se seu voto é obrigatório ou facultativo, conforme a tabela abaixo:

            Scanner ler = new Scanner(System.in);

            int idade;

            System.out.println("Insira sua idade para verificar o status de votação: ");
            idade = ler.nextInt();

            if (idade >= 16 && idade < 18){
                System.out.println("A pessoa está apta a votar e o voto é facultativo.");
            }else if (idade >= 18 && idade < 65){
                System.out.println("A pessoa está apta a votar e o voto é obrigatório.");
            }else if (idade >= 65){
                System.out.println("A pessoa está apta a votar e o voto é facultativo.");
            }else if (idade < 16) {
                System.out.println("A pessoa não está apta a votar.");
            }
        }
    }
}
