package sorting.linearSorting;

import sorting.AbstractSorting;

/**
 * Classe que implementa a estratégia de Counting Sort vista em sala.
 *
 * Procure evitar desperdício de memória: AO INVÉS de alocar o array de contadores
 * com um tamanho arbitrariamente grande (por exemplo, com o maior valor de entrada possível),
 * aloque este array com o tamanho sendo o máximo inteiro presente no array a ser ordenado.
 *
 * Seu algoritmo deve assumir que o array de entrada nao possui numeros negativos,
 * ou seja, possui apenas numeros inteiros positivos e o zero.
 *
 */
public class CountingSort extends AbstractSorting<Integer> {

	@Override
	public void sort(Integer[] array, int leftIndex, int rightIndex) {

		int[] arrayAux = new int[encontraMaior(array, leftIndex, rightIndex) + 1];
		for(int i = 0;i <= arrayAux.length; i++){
			arrayAux[i] = 0;
		}

		for(int i = leftIndex; i < rightIndex; i++){
			arrayAux[array[i]] += 1;
		}

		for(int j = 1; j < arrayAux.length; j++){
			arrayAux[j] += arrayAux[j-1];
		}

		int[] arrayord =new int[rightIndex];

		for(int i = rightIndex - 1; i >= 0; i--){
			arrayord[arrayAux[array[i - 1] - 1]] = array[i];
			arrayAux[array[i - 1]] -=1;
		}

		for(int i = 0; i < arrayord.length; i++){
			array[leftIndex+i] = arrayord[i];
		}

	}

	private int encontraMaior(Integer[] array, int left, int right){
		int maior = array[left];
		for(int i = left + 1; i <= right; i++){
			if(array[i] > maior){
				maior = array[i];
			}
		}
		return maior;
	}

}
