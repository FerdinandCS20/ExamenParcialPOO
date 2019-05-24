package ejercicio5ExamenParcial;

import java.util.Scanner;

public class Ejercicio5ExamenParcial {
	public static boolean Palíndromo(String Palabra)
	{
		for( int i = 0; i < Palabra.length();i++)
		{
			if (Palabra.charAt(i)!= Palabra.charAt(Palabra.length()-i-1))
			{
				return false;
			}
		}
		return true;
	}
	public static void main (String[]args) {
		String frase;
		String frase2;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese la frase a evaluar: ");
		frase= teclado.nextLine();
		frase2= frase.toLowerCase();
		if (Palíndromo(frase2)==true)
		{
			System.out.println("La frase es un palíndromo");
		}
		else
		{
			System.out.println("La frase no es palíndromo");
		}
	}
}
