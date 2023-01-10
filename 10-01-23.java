import java.util.Locale;
import java.util.Scanner;

public class Atividade1 {

    // 01 - Dado o Fluxograma abaixo, desenvolva o algoritmo abaixo utilizando valores do tipo float:

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float salario, abono;

        System.out.println("Digite o Valor do Salário: ");
        salario = ler.nextFloat();
        System.out.println("Digite o Valor do Abono: ");
        abono = ler.nextFloat();

        System.out.println("O novo Salário será de R$" + (salario + abono));
    }
}

import java.util.Scanner;

public class Atividade2 {

    // 02 - Elabore um algoritmo que leia 4 notas de um participante, em variáveis do tipo
    //      float e exiba na tela a média final do participante. Veja o exemplo abaixo:

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float nota1, nota2, nota3, nota4;

        System.out.println("Digite o Valor da Nota1: ");
        nota1 = ler.nextFloat();
        System.out.println("Digite o Valor da Nota2: ");
        nota2 = ler.nextFloat();
        System.out.println("Digite o Valor da Nota3: ");
        nota3 = ler.nextFloat();
        System.out.println("Digite o Valor da Nota4: ");
        nota4 = ler.nextFloat();

        System.out.printf("\nA média final será de: %.1f", (nota1 + nota2 + nota3 + nota4)/4);

    }
}

import java.util.Scanner;

public class Atividade3 {

    // 03 - Elabore um algoritmo que leia o Salário Bruto, o Adicional Noturno,
    //      as Horas Extras e os Descontos de um Colaborador, em variáveis do tipo float
    //      e exiba na tela o Salário Líquido. Veja o exemplo abaixo:

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float salariobruto, adicionalnoturno, horasextras, descontos;

        System.out.println("Digite o valor do Salário Bruto: ");
        salariobruto = ler.nextFloat();
        System.out.println("Digite o valor do adicional noturno: ");
        adicionalnoturno = ler.nextFloat();
        System.out.println("Digite o valor total das horas extras: ");
        horasextras = ler.nextFloat();
        System.out.println("Digite o valor a ser descontado: ");
        descontos = ler.nextFloat();

        System.out.printf("\nO salário líquido será de R$ %.2f", salariobruto + adicionalnoturno + (horasextras*5) - descontos);

    }
}

import java.util.*;

public class Atividade4 {

    // 04 - Leia quatro valores float (numero1, numero2, numero3 e numero4).
    //      A seguir, calcule e mostre a diferença do produto entre o numero1
    //      e o numero2 pelo produto entre o numero3 e o numero4. Veja os exemplos abaixo:

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        float numero1, numero2, numero3, numero4, diferenca;

        System.out.println("Digite o numero 1: ");
        numero1 = ler.nextFloat();
        System.out.println("Digite o numero 2: ");
        numero2 = ler.nextFloat();
        System.out.println("Digite o numero 3: ");
        numero3 = ler.nextFloat();
        System.out.println("Digite o numero 4: ");
        numero4 = ler.nextFloat();

        diferenca =  (numero1*numero2)-(numero3*numero4);

        System.out.printf("\nA diferença do produto entre o numero1 e o numero2 pelo produto entre o numero3 e o numero4 é de: %f", diferenca);

    }
}
