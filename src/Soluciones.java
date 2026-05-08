import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Soluciones a https://retosdeprogramacion.com/ejercicios
 */

public class Soluciones {
	
	public Soluciones() {
	//	fizzbuzz();
	//	System.out.println(esAnagrama("fresa","frase"));
	//	System.out.println(esEquilibrada("[{}(())]"));
	//	System.out.println(esPalindromo("abccba"));
	//	System.out.println(esNumeroNarcisista(1634));
		System.out.println(ponerMayuscula("un dos tres"));
		
	}
	
	/*
	 * Escribe un programa que muestre por consola (con un print) los
	 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
	 * cada impresión), sustituyendo los siguientes:
	 * - Múltiplos de 3 por la palabra "fizz".
	 * - Múltiplos de 5 por la palabra "buzz".
	 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
	 */
	public void fizzbuzz() {
		for(int i=1;i<=100;i++) {
			if(esMultiploDeTres(i)&&esMultiploDeCinco(i))
				System.out.println("fizzbuzz");
			else if(esMultiploDeTres(i))
				System.out.println("fizz");
			else if(esMultiploDeCinco(i))
				System.out.println("buzz");
			else			
				System.out.println(i);
		}
	}
	
	/*
	 * Escribe una función que reciba dos palabras (String) y retorne
	 * verdadero o falso (Bool) según sean o no anagramas.
	 * - Un Anagrama consiste en formar una palabra reordenando
	 *   las letras de otra palabra inicial.
	 * - NO hace falta comprobar que ambas palabras existan.
	 * - Dos palabras exactamente iguales no son anagrama.
	 */
	public boolean esAnagrama(String a, String b) {
		if(a.equals(b))
			return false;
		else if(a.length()!=b.length())
			return false;
		else {
			//Convierto a ArrayList
			ArrayList<Character> a1=new ArrayList<Character>();
			for(int i=0;i<a.length();i++)
				a1.add(a.charAt(i));
			ArrayList<Character> b1=new ArrayList<Character>();
			for(int i=0;i<b.length();i++)
				b1.add(b.charAt(i));
			a1.sort(null);
			b1.sort(null);
			for(int i=0;i<a1.size();i++) {
				if(a1.get(i)!=b1.get(i))
					return false;
			}
			return true;
		}
	}
	
	
	
	/*
	 * Escribe un programa que imprima los 50 primeros números de la sucesión
	 * de Fibonacci empezando en 0.
	 * - La serie Fibonacci se compone por una sucesión de números en
	 *   la que el siguiente siempre es la suma de los dos anteriores.
	 *   0, 1, 1, 2, 3, 5, 8, 13...
	 */
	public void fibonacci() {
		int numeroAnteAnterior=0;
		int numeroAnterior=1;
		for(int i=0;i<50;i++) {
			//PEREZA
		}
		
	}
	
	/*
	 * Escribe un programa que se encargue de comprobar si un número es o no primo.
	 * Hecho esto, imprime los números primos entre 1 y 100.
	 */
	//TODO
	
	/*
	 * Crea una única función (importante que sólo sea una) que sea capaz
	 * de calcular y retornar el área de un polígono.
	 * - La función recibirá por parámetro sólo UN polígono a la vez.
	 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
	 * - Imprime el cálculo del área de un polígono de cada tipo.
	 */
	public int getArea(Poligono p) {
		return p.getArea();
	}
	
	/*
	 * Crea un programa que invierta el orden de una cadena de texto
	 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
	 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
	 */
	
	public String invertir(String cadena) {
		String resultado="";
		for(int i=cadena.length()-1;i>=0;i--)
			resultado=resultado+cadena.charAt(i);
		return resultado; 
	}
	
	/*
	 * Crea un programa que cuente cuantas veces se repite cada palabra
	 * y que muestre el recuento final de todas ellas.
	 * - Los signos de puntuación no forman parte de la palabra.
	 * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
	 * - No se pueden utilizar funciones propias del lenguaje que
	 *   lo resuelvan automáticamente.
	 */
	public void contarPalabras(String cadena) {
		String[] palabras=cadena.split(" ");
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(palabras));
		al.sort(null);
		//PEREZA
	}
	
	/*
	 * Crea un programa se encargue de transformar un número
	 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
	 */
	public void toBinario(int decimal) {
		//PEREZA
	}
	
	/*
	 * Crea un programa que sea capaz de transformar texto natural a código
	 * morse y viceversa.
	 * - Debe detectar automáticamente de qué tipo se trata y realizar
	 *   la conversión.
	 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras
	 *   o símbolos y dos espacios entre palabras "  ".
	 * - El alfabeto morse soportado será el mostrado en
	 *   https://es.wikipedia.org/wiki/Código_morse.
	 */
	public String toMorse(String cadena) {
		//PEREZA
		return null;
	}
	
	/*
	 * Crea un programa que comprueba si los paréntesis, llaves y corchetes
	 * de una expresión están equilibrados.
	 * - Equilibrado significa que estos delimitadores se abren y cieran
	 *   en orden y de forma correcta.
	 * - Paréntesis, llaves y corchetes son igual de prioritarios.
	 *   No hay uno más importante que otro.
	 * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
	 * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
	 */
	public boolean esEquilibrada(String expresion) {
		Stack<Character> pila = new Stack<Character>();
		for(int i=0;i<expresion.length();i++) {
			char c=expresion.charAt(i);
			if(c=='{'||c=='('||c=='[')
				pila.push(c);
			else if((c==')'||c=='}'||c==']')&&pila.isEmpty())
				return false;
			else if(c==')') {
				char c2=pila.pop();
				if(c2!='(')
					return false;
			}
			else if(c==']') {
				char c2=pila.pop();
				if(c2!='[')
					return false;
			}
			else if(c=='}') {
				char c2=pila.pop();
				if(c2!='{')
					return false;
			}
		} 
		if(pila.size()==0)
			return true;
		else
			return false;
	}
	
	/*
	 * Escribe una función que reciba un texto y retorne verdadero o
	 * falso (Boolean) según sean o no palíndromos.
	 * Un Palíndromo es una palabra o expresión que es igual si se lee
	  * de izquierda a derecha que de derecha a izquierda.
	 * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
	 * Ejemplo: Ana lleva al oso la avellana.
	 */
	public boolean esPalindromo(String palabra) {
		for(int i=0;i<palabra.length()/2;i++)
			if(palabra.charAt(i)!=palabra.charAt(palabra.length()-1-i))
				return false;
		return true;
	}
	
	/*
	 * Escribe una función que calcule si un número dado es un número de Armstrong
	 * (o también llamado narcisista).
	 * Si no conoces qué es un número de Armstrong, debes buscar información
	 * al respecto.
	 */
	public boolean esNumeroNarcisista(int n) {
		String s=Integer.toString(n);
		int sumatorio=0;
		for(int i=0;i<s.length();i++) {
			int numeroActual=Character.getNumericValue(s.charAt(i));		
			sumatorio+=Math.pow(numeroActual, s.length());
			
		}
		if(sumatorio==n)
			return true;
		else
			return false;
	}
	
	/*
	 * Crea una función que reciba un String de cualquier tipo y se encargue de
	 * poner en mayúscula la primera letra de cada palabra.
	 * - No se pueden utilizar operaciones del lenguaje que
	 *   lo resuelvan directamente.
	 */
	public String ponerMayuscula(String s) {
		String cadena="";
		for(int i=0;i<s.length();i++) {
			if(i==0)
				cadena+=Character.toUpperCase(s.charAt(i));
			else if(s.charAt(i-1)==' ')
				cadena+=Character.toUpperCase(s.charAt(i));
			else
				cadena+=s.charAt(i);
		}
		return cadena;
	}
	
	/*
	 * Crea una función que reciba dos array, un booleano y retorne un array.
	 * - Si el booleano es verdadero buscará y retornará los elementos comunes
	 *   de los dos array.
	 * - Si el booleano es falso buscará y retornará los elementos no comunes
	 *   de los dos array.
	 * - No se pueden utilizar operaciones del lenguaje que
	 *   lo resuelvan directamente.
	 */
	public int[] conjuntos(int[] a, int[] b, boolean comunes) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		//PEREZA
		int[] c=new int[al.size()];
		for(int i=0;i<al.size();i++)
			c[i]=al.get(i);
		return c;
	}
	
	/*
	 * Crea un programa que calcule quien gana más partidas al piedra,
	 * papel, tijera.
	 * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
	 * - La función recibe un listado que contiene pares, representando cada jugada.
	 * - El par puede contener combinaciones de "R" (piedra), "P" (papel)
	 *   o "S" (tijera).
	 * - Ejemplo. Entrada: [("R","S"), ("S","R"), ("P","S")]. Resultado: "Player 2".
	 */
	
	
	/*
	 * Crea un programa que dibuje un cuadrado o un triángulo con asteriscos "*".
	 * - Indicaremos el tamaño del lado y si la figura a dibujar es una u otra.
	 * - EXTRA: ¿Eres capaz de dibujar más figuras?
	 */
	
	/*
	 * Crea una función que reciba un texto y muestre cada palabra en una línea,
	 * formando un marco rectangular de asteriscos.
	 * - ¿Qué te parece el reto? Se vería así:
	 *   **********
	 *   * ¿Qué   *
	 *   * te     *
	 *   * parece *
	 *   * el     *
	 *   * reto?  *
	 *   **********
	 */
	
	/*
	 * Dado un listado de números, encuentra el SEGUNDO más grande
	 */
	
	/*
	 * Crea una función que imprima los 30 próximos años bisiestos
	 * siguientes a uno dado.
	 * - Utiliza el menor número de líneas para resolver el ejercicio.
	 */
	
	/*
	 * Dado un array de enteros ordenado y sin repetidos,
	 * crea una función que calcule y retorne todos los que faltan entre
	 * el mayor y el menor.
	 * - Lanza un error si el array de entrada no es correcto.
	 */
	
	/*
	 * Crea un programa que calcule el daño de un ataque durante
	 * una batalla Pokémon.
	 * - La fórmula será la siguiente: daño = 50 * (ataque / defensa) * efectividad
	 * - Efectividad: x2 (súper efectivo), x1 (neutral), x0.5 (no es muy efectivo)
	 * - Sólo hay 4 tipos de Pokémon: Agua, Fuego, Planta y Eléctrico 
	 *   (buscar su efectividad)
	 * - El programa recibe los siguientes parámetros:
	 *  - Tipo del Pokémon atacante.
	 *  - Tipo del Pokémon defensor.
	 *  - Ataque: Entre 1 y 100.
	 *  - Defensa: Entre 1 y 100.
	 */
	
	/*
	 * Crea un programa se encargue de transformar un número binario
	 * a decimal sin utilizar funciones propias del lenguaje que
	 * lo hagan directamente.
	 */
	
	/*
	 * Crea una función que transforme grados Celsius en Fahrenheit
	 * y viceversa.
	 *
	 * - Para que un dato de entrada sea correcto debe poseer un símbolo "°"
	 *   y su unidad ("C" o "F").
	 * - En caso contrario retornará un error.
	 */
	
	/*
	 * Crea una función que sea capaz de encriptar y desencriptar texto
	 * utilizando el algoritmo de encriptación de Karaca
	 * (debes buscar información sobre él).
	 */
	
	
	
	//Métodos auxiliares
	

	private boolean esMultiploDeTres(int numero) {
		if(numero%3==0)
			return true;
		else
			return false;
	}
	
	private boolean esMultiploDeCinco(int numero) {
		if(numero%5==0)
			return true;
		else
			return false;
	}
	

	public static void main(String[] args) {
		new Soluciones();
	}

}
