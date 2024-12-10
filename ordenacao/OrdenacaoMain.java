
import java.util.Scanner;

public class OrdenacaoMain{

    private ArraysAbstrato ordem;
    
    private static void menuEscolha() {
        String menu = "Escolha qual algoritmo de ordenação está testando:" +
                        "\n 1 - SelectionSort" +
                        "\n 2 - InsertioSort" +
                        "\n 3 - QuickSort" +
                        "\n 4 - MergeSort" +
                        "\n 5 - XXXSort" ;

        System.out.println(menu);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");

        menuEscolha();
        int algoritmoEscolhido = sc.nextInt();
        

        int[] lista = ordem. transformaEmInt(entrada);

        sc.close();
    }

    private static int[] transformaEmInt(String[] entrada){
        int[] saida = new int[entrada.length];
        for (int i = 0; i < entrada.length - 1; i++)
            saida[i] = Integer.parseInt(entrada[i]);
        return saida;
    }
}