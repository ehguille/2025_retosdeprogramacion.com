import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import piedrapapeltijera.Eleccion;
import piedrapapeltijera.Jugada;
import figuras.*;

/**
 * Soluciones a https://retosdeprogramacion.com/ejercicios
 */

public class Soluciones {
	
	public Soluciones() {
	//	fizzbuzz();
	//	fibonacci();
	//	System.out.println(esAnagrama("fresa","frase"));
	//	System.out.println(esEquilibrada("[{}(())]"));
	//	System.out.println(esPalindromo("abccba"));
	//	System.out.println(esNumeroNarcisista(1634));
	//	System.out.println(ponerMayuscula("un dos tres"));
	//	imprimirPrimos(100);
	//	toBinario(1021);
	//	contarPalabras("Hola, estás, aquí, Hola, estás aquí aquí aquí pepe");
	//	int[] a={7,9,8,4,1};
	//	int[] b={7,3,2,4,0};
	//	conjuntos(a,b,false);
	/*	Jugada[] jugadas= {new Jugada(Eleccion.PAPEL, Eleccion.PIEDRA),
				new Jugada(Eleccion.PAPEL, Eleccion.PIEDRA),
				new Jugada(Eleccion.PIEDRA, Eleccion.PIEDRA),
				new Jugada(Eleccion.PIEDRA, Eleccion.TIJERA),
				new Jugada(Eleccion.TIJERA, Eleccion.TIJERA),
				new Jugada(Eleccion.TIJERA, Eleccion.PAPEL),
				new Jugada(Eleccion.TIJERA, Eleccion.TIJERA),
				new Jugada(Eleccion.PAPEL, Eleccion.PIEDRA),
				new Jugada(Eleccion.PAPEL, Eleccion.PIEDRA),
				new Jugada(Eleccion.PAPEL, Eleccion.PIEDRA)
				};
		contadorResultados(jugadas);*/
	//	dibujarFigura(10,"triángulo");
	//	enmarcar("Vale por un bollo preñao.");
		//int[] listado={-1,-2,-3,-4,-5,-7,-12,-14,-16,-20};
		//System.out.println(obtenerSegundoMayor(listado));
	//	imprimirProximos30Bisiestos(2026);
		int[] numeros= {7,9,10,13,15,18};
		
		//TODO: MODIFICAR PARA QUE IMPRIMA ESTO
		obtenerFaltantes(numeros);
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
		double numeroAnteAnterior=0;
		double numeroAnterior=1;
		System.out.println(numeroAnteAnterior);
		System.out.println(numeroAnterior);
		for(int i=0;i<48;i++) {
			double numeroActual=numeroAnterior+numeroAnteAnterior;
			numeroAnteAnterior=numeroAnterior;
			numeroAnterior=numeroActual;
			System.out.println(numeroActual);		
		}		
	}
	
	/*
	 * Escribe un programa que se encargue de comprobar si un número es o no primo.
	 * Hecho esto, imprime los números primos entre 1 y 100.
	 */
	public boolean esPrimo(int n) {
		for(int i=n-1;i>1;i--)
			if(n%i==0)
				return false;
		return true;
	}
	
	public void imprimirPrimos(int n) {
		for(int i=0;i<n;i++)
			if(esPrimo(i))
				System.out.println(i);
	}
	
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
		HashMap<String, Integer> contador= new HashMap<String, Integer>();
		//Con esto quito los signos
		cadena=cadena.replace(',',' ');
		cadena=cadena.replace('.',' ');
		cadena=cadena.trim();
		String[] palabras=cadena.split(" ");
		for(int i=0;i<palabras.length;i++) {
			String palabra=palabras[i].trim().toUpperCase();
			if(palabra!="")
				if(!contador.containsKey(palabra))
					contador.put(palabra,1);
				else
					contador.put(palabra, contador.get(palabra)+1);
		}
		for(String palabra: contador.keySet()) {
			System.out.println(palabra+" "+contador.get(palabra));
		}
	}
	
	/*
	 * Crea un programa se encargue de transformar un número
	 * decimal a binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
	 */
	public void toBinario(int decimal) {
		String resultado="";
		int dividendo=decimal;
		int divisor=2;
		int cociente=dividendo/divisor;
		int resto=dividendo%divisor;
		while(cociente>0) {
			resultado+=resto; 
			dividendo=cociente;
			cociente=dividendo/divisor;
			resto=dividendo%divisor;
		}
		resultado+=resto;
		for(int i=resultado.length()-1;i>=0;i--)
			System.out.print(resultado.charAt(i));
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
	public Integer[] conjuntos(int[] a, int[] b, boolean comunes) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		if(comunes) {
			for(int i=0;i<a.length;i++)
				for(int j=0;j<b.length;j++) {
					if(a[i]==b[j]) 
						if(!al.contains(a[i]))
							al.add(a[i]);
				}
		}
		else {
			for(int i=0;i<a.length;i++) {
				boolean repetido=false;
				for(int j=0;j<b.length;j++) {
					if(a[i]==b[j]) {
						repetido=true;
						break;
					}
				}
				if(repetido==false)
					al.add(a[i]);
			}
			for(int j=0;j<b.length;j++) {
				boolean repetido=false;
				for(int i=0;i<a.length;i++) {
					if(a[i]==b[j]) {
						repetido=true;
						break;
					}
				}
				if(repetido==false)
					al.add(b[j]);
			}
		}
		return (Integer[])al.toArray();
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
	public void contadorResultados(Jugada[] jugada) {
		int contadorPlayer1=0;
		int contadorPlayer2=0;
		int contadorEmpates=0;
		for(int i=0;i<jugada.length;i++)
			if(jugada[i].evaluarPartida().equals("Player 1"))
				contadorPlayer1++;
			else if (jugada[i].evaluarPartida().equals("Player 2"))
				contadorPlayer2++;
			else
				contadorEmpates++;
		System.out.println("Contador Player 1: "+contadorPlayer1);
		System.out.println("Contador Player 2: "+contadorPlayer2);
		System.out.println("Contador Empates: "+contadorEmpates);
	}
	
	/*
	 * Crea un programa que dibuje un cuadrado o un triángulo con asteriscos "*".
	 * - Indicaremos el tamaño del lado y si la figura a dibujar es una u otra.
	 * - EXTRA: ¿Eres capaz de dibujar más figuras?
	 */
	public void dibujarFigura(int size, String tipo) {
		if(tipo.toUpperCase().equals("CUADRADO")) {
			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
					if(i==0||i==size-1)
						System.out.print("*");
					else if(j==0||j==size-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println("");
			}			
		} else if (tipo.toUpperCase().equals("TRIÁNGULO")) {
			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
					if(i==size-1||j==0||(i==j))
						System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println("");
			}
		} else {
			System.out.println("Opciones válidas: cuadrado o triángulo.");
		}
	}
	
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
	
	public void enmarcar(String frase) {
		String[] palabras=frase.split(" ");
		int longitudPalabraMasLarga=0;
		for(int i=0;i<palabras.length;i++)
			if(palabras[i].length()>longitudPalabraMasLarga)
				longitudPalabraMasLarga=palabras[i].length();
		for(int i=0;i<=longitudPalabraMasLarga+1;i++)
			System.out.print("*");
		System.out.println("");
		for(int i=0;i<palabras.length;i++) {
			int numeroEspacios=longitudPalabraMasLarga-palabras[i].length();
			System.out.print("*"+palabras[i]);
			for(int j=0;j<numeroEspacios;j++)
				System.out.print(" ");
			System.out.println("*");
		}
		for(int i=0;i<=longitudPalabraMasLarga+1;i++)
			System.out.print("*");
	}
	
	/*
	 * Dado un listado de números, encuentra el SEGUNDO más grande
	 */
	public int obtenerSegundoMayor(int[] numeros) {
		int maximo=Integer.MIN_VALUE;
		int indice=0;
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]>maximo) {
				maximo=numeros[i];
				indice=i;
			}
		}
		maximo=Integer.MIN_VALUE;
		numeros[indice]=Integer.MIN_VALUE;
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]>maximo)
				maximo=numeros[i];
		}
		return maximo;
	}
	
	/*
	 * Crea una función que imprima los 30 próximos años bisiestos
	 * siguientes a uno dado.
	 * - Utiliza el menor número de líneas para resolver el ejercicio.
	 */
	public void imprimirProximos30Bisiestos(int anyoActual) {
		int contadorBisiestos=0;
		while(contadorBisiestos<30) {
			if(esBisiesto(anyoActual)) {
				System.out.println(anyoActual);
				contadorBisiestos++;
			}
			anyoActual++;				
		}
	}
	
	public boolean esBisiesto(int anyo) {
		if(anyo%100==0)
			if(anyo%400==0)
				return true;
			else
				return false;
		else
			if(anyo%4==0)
				return true;
			else
				return false;
	}
	
	
	/*
	 * Dado un array de enteros ordenado y sin repetidos,
	 * crea una función que calcule y retorne todos los que faltan entre
	 * el mayor y el menor.
	 * - Lanza un error si el array de entrada no es correcto.
	 */
	public Integer[] obtenerFaltantes(int[] numeros) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		int minimo=numeros[0];
		int maximo=numeros[numeros.length-1];
		for(int i=minimo+1;i<maximo;i++) {
			boolean existeNumero=false;
			for(int j=0;j<numeros.length;j++) {
				if(numeros[j]>i)
					break;
				if(numeros[j]==i) {
					existeNumero=true;
					break;
				}
			}
			if(!existeNumero)
				al.add(i);	
		}
		Integer[] array=(Integer[])al.toArray(new Integer[0]);
		return array;
		
	}
	
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
