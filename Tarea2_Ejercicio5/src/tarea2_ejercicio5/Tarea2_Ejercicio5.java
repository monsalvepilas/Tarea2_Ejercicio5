
import java.util.Scanner;

public class Tarea2_Ejercicio5 {

	public static void main(String[] args) {

		Scanner EntradaDatosRectanculo = new Scanner(System.in);

		int alto = 0;
		int ancho = 0;

		System.out.println("Solo puedes valores entre 0 y 10 ");

		do {

			System.out.print("Introduce el alto del rectángulo: ");

			alto = EntradaDatosRectanculo.nextInt();

			if ((alto < 0) || (alto > 10)) {

				System.out.println("HAS INTRODUCIDO UN VALOR NO VÁLIDO, POR FAVOR, INTRODUZCA DATOS CORRECTOS ");
			}
		}

		while ((alto < 0) || (alto > 10));

		do {

			System.out.print("Introduce el ancho del rectángulo: ");

			ancho = EntradaDatosRectanculo.nextInt();

			if ((ancho < 0) || (ancho > 10)) {

				System.out.println("HAS INTRODUCIDO UN VALOR NO VÁLIDO, POR FAVOR, INTRODUZCA DATOS CORRECTOS ");
			}

		} while ((ancho < 0) || (ancho > 10));

		if ((alto == 0) || (ancho == 0)) {

			System.out.print("Es imposible construir un rectángulo sin lados. El programa finalizará ");
			System.exit(0);

		}

		if (alto == ancho) {

			System.out.print(" El programa finalizará porque los rectángulos tienen" + " lados de distintos tamaños");
			System.exit(0);

		}

		while (alto > 0) {

			int ancho2 = ancho;
			
			/* AQUÍ NO SÉ PORQUÉ NO ME COGE EL VALOR DE LA VARIABLE "ANCHO"
			 * DIRECTAMENTE Y SIN EMBARGO, CREANDO OTRA LO PILLA */

			while (ancho2 > 0) {

				if (alto % 2 == 0)
					System.out.print(" * ");
				else
					System.out.print(" - ");
				ancho2--;
			}
			System.out.println();

			alto--;
		}

	}
