import java.util.Scanner;

public class Java00
{
	public static void main(String[] args)
	{
		/* Datos: 
		 * 		byte, short, int, long 
		 * 		float, double
		 * 		boolean
		 * 		char
		 * 		String
		 * Conversiones:
		 * 		Numeros (int) (float)
		 *  	Texto a numeros Integer.parseInt(), Float.parseFloat(), Double.parseDouble()
		 * 	Comparacion strings
		 *  	string1.equals(string2)
		 * Entrada teclado
		 * 		nextInt(), nextFloat, nextBoolean
		 * Salida con formato
		 * 		printf(
		 * 			%d int, long
		 * 			%f float, double
		 * 			%s string
		 * 			%n intro
		 * 			%05d relleno con 0 hasta 5 cifras
		 * 			%5d  relleno de espacios hasta 5 cifras
		 * 			%3f  3 cifras enteras
		 * 			%3.2f 3 enteros con 2 decimales
		 * Constantes
		 * 		public static final int MAXIMO = 3;
		 * 	
		 */
		System.out.println("Hola mundo");
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce numero: ");
		int number = sc.nextInt();
		System.out.println("Tu numero es " + number);
		String text = sc.nextLine();
		sc.close();
	}
}
