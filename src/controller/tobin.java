package controller;

public class tobin {

	public tobin() {
		super();
	}
	public static String tobin(int a) {
		if (a == 0) {
			//Toda vez que o numero for divisivel por 2, retorna o valor zero em string
			return "0";
			//Se o valor não for igual a zero, o código faz a divisão, somando com o resto da mesma
		} else {
			return tobin(a/2) + (a%2);
		}	
		/* cada vez que o número selecionado na função main for divisível por 2, ele 
		*continua, até chegar a um dividendo menor que 2. Se esse nr for 0, ele 
		*encerra com 0. Se o dividendo for 1, ele encerra com 1
		*/
	}
}
	
	
	
