package ejercicio6ExamenParcial;

import java.util.Scanner;

public class Ejercicio6ExamenParcial {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo de números a evaluar: ");
		int n= teclado.nextInt();
		int [] arreglo= new int[n];
		
		for (int i = 0; i<=n-1;i++)
		{
		System.out.print("Ingrese a "+i+": ");
		arreglo[i]= teclado.nextInt();
		}
		
        int vmp[] = new int[5]; // vector con mayor producto.
        int vsp[] = new int[5]; // vector con el siguiente producto.
        int m = 0;
        int multi = 1;
        
        	while(m<(arreglo.length-3)){
        	 int  multiAux = 1;
             int p=m;
             
             		for (int k = 0; k < 4; k++) //Se toca cada 5 caracteres 
             		{								
             		vsp[k]= arreglo[p];
             		multiAux = multiAux*(arreglo[p]);
             		p++;
             		}
             			if(multiAux>multi) //se compara con el mayor producto guardado anteriormente
             			{
             				for (int j = 0; j < 4; j++) 
             				{
             				vmp[j]=vsp[j];
             				}
             				multi = multiAux;
             			}
             			m++;
        }
        System.out.println("Vector con mayor producto: ["+vmp[0]+" , "+vmp[1]+" , "+vmp[2]+" , "+vmp[3]+"]");
        System.out.println("\nMáxima Multiplicación: "+multi);
        
		}
	}