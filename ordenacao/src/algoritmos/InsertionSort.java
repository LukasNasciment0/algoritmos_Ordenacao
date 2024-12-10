



/*
O InsertionSort trabalha 2 a 2. Compara o elemento com o anterior e ordena 2 a 2
assim vai até o fim do array de entrada
É in-place
É estável
Faz muitas comparacoes
*/
public class InsertionSort extends ArraysAbstrato{

    private void insertion(int[] v){
        
        for (int i = 1; i < v.length; i++) {
            int j = v.length - 1;
            while(j > 0 && v[j] < v[j-1])
            swap(v, j, j-1);
            
        }
        
    }

    @Override
    public void ordenar(int[] v) {
        insertion(v);
    }
  

}
