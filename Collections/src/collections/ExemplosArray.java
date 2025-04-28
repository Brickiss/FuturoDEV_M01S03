package collections;

import java.util.Arrays;

public class ExemplosArray {
    public static void main(String[] args) {

        int[] anoCopas1 = {2022, 2018, 2014, 2010, 2006,2002};
        //ou
        int [] anosCopa2 = new int[6];
        anosCopa2[0] = 2002;
        anosCopa2[1] = 2006;
        anosCopa2[2] = 2010;
        anosCopa2[3] = 2014;
        anosCopa2[4] = 2018;
        anosCopa2[5] = 2022;

        System.out.println(anosCopa2[0]);

        for (int i = 0 ; i < anosCopa2.length; i++){
            System.out.println("Todos do 'anoCopas': " + anosCopa2[i]);
        }

        String[] carros = new String[5];
        carros[0] = "Uno";
        carros[1] = "Corsa";
        carros[2] = "Polo";
        carros[3] = "Civic";
        carros[4] = "Porsche";


        System.out.println("Local na memória:"+ anoCopas1);
        System.out.println("Tamanho, quantidade de elementos que cabem no array: " + anoCopas1.length);
        System.out.println("Primeiro elemento do Array anoCopas: " + anoCopas1[0]);
        System.out.println("Último elemento do Array anoCopas: " + anoCopas1[anoCopas1.length -1]);

        for (int ano : anoCopas1){
            System.out.println("Um dos anos de Copa do Mundo" + ano);

        }
        for (String tipo : carros){
            System.out.println("Carro: " + tipo);
        }


        int carroAleatorio = (int) (Math.random() * (4));
        System.out.println(carroAleatorio);

        System.out.printf("Carro aleatório: %s", carros[carroAleatorio] );

        Arrays.sort(anoCopas1);
        //Após a organização dos valores inteiros em ordem crescente, a busca binária será capaz de ser realizada.
        //Eu devo criar uma variavél para armazenar o resultado da pesquisa binária.
        int indexDoValor = Arrays.binarySearch(anoCopas1, 2010);
        System.out.printf("%nIndex do valor 2010 em anoCopas1: %d %n", indexDoValor);

        int[] somente6 = new int[6];
        Arrays.fill(somente6, 6);

        for (int valor : somente6){
            System.out.println(valor);
        }




    }
}
