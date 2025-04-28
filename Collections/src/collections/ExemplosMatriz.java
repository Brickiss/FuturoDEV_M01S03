package collections;

public class ExemplosMatriz {
    public static void main(String[] args) {
        int [][] matriz = new int [3] [2];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        matriz[2][0] = 5;
        matriz[2][1] = 6;

        for (int linha = 0; linha < matriz.length ; linha++){
            for (int coluna = 0; coluna < matriz[0].length ; coluna++){
                System.out.println(matriz[linha][coluna]);
            }
        }

        int [][] matriz2= {
            {1, 2, 3},
            {4, 5, 6}
        };
        for (int[] vetor : matriz2) {         // Loop externo: percorre cada LINHA da matriz
            for (int elemento : vetor) {     // Loop interno: percorre cada ELEMENTO da linha
                System.out.println(elemento); // Imprime o elemento
            }
        }
    }
}
