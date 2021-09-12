package NumetoBinario;
public class NumeroBinario {
	public static int NBinario(
	int [] sortedArray, int numero, int primeiro, int ultimo) {
	int index = -1;
	
	while(primeiro <= ultimo){
		int mid = (primeiro + ultimo) / 2;
		if (sortedArray[mid] < numero) {
			primeiro = mid + 1;
		}else if (sortedArray[mid] > numero) {
			ultimo = mid - 1;
		}else if (sortedArray[mid] == numero) {
			index = mid;
			break;
		}
		}
		return index;
	}
	

 public static void main (String [] args) {
	System.out.println(
			NBinario(new int[]{1 ,2 ,3 ,4}, 1, 0, 3));
	        //Ao rodar o código, ele irá retornar o valor 0, pois irá buscar o número 1 que se encontra na posição 0 dos quatros números descritos.
	}
}