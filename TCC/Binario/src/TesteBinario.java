import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import org.junit.jupiter.api.Test;

import NumetoBinario.NumeroBinario;

class TesteBinario {

	//Ao rodar esse comando de teste ele irá buscar o número 1 no vetor.
	void BuscarNumero() { 
		int v[] = {1, 2, 3, 4};
		assertThat(NumeroBinario.NBinario(v, 1, 0, 3), is(0));
	}
	
	
	//Ao rodas esse comando de teste ele irá tentar buscar número 5, 
    //porém por esse número não estar dentro dov etor ele não irá encontrar, retornando o erro.
	
	/*@Test
	void NaoBuscar() { 
		int v[] = {1, 2, 3, 4};
		assertThat(NumeroBinario.NBinario( v, 5, 0, 3), -1);
}
*/

}