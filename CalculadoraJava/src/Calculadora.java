import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
	}

	public static void Menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué operación deseas realizar?");
		int seleccion = sc.nextInt();
		switch (seleccion) {
		case 1:
			Suma();
			break;
		case 2:
			Resta();
			break;
		case 3:
			Multiplicacion();
			break;
		case 4:
			Division();
			break;
		case 5:
			//Seno();
			break;
		case 6:
			//Coseno();
			break;
		case 7:
			//Potencia();
			break;
		case 8:
			//Raiz();
			
		}
	}

	public static void Suma() {
		int suma, num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		num1 = sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2 = sc.nextInt();
		suma = num1 + num2;
		System.out.println("El resultad es: " + suma);
	}

	public static void Resta() {
		int resta, num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		num1 = sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2 = sc.nextInt();
		resta = num1 - num2;
		System.out.println("El resultad es: " + resta);
	}

	public static void Multiplicacion() {
		int multi, num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		num1 = sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2 = sc.nextInt();
		multi = num1 * num2;
		System.out.println("El resultad es: " + multi);
	}

	public static void Division() {
		int num1, num2, div, resto;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		num1 = sc.nextInt();
		System.out.println("Introduce el segundo número: ");
		num2 = sc.nextInt();
		if (num2 != 0) {
			div = num1 / num2;
			resto = num1 % num2;
			System.out.println("El cociente de " + num1 + " entre " + num2 + " es " + div + " y su resto es " + resto);
		} else {
			System.out.println("No se puede dividir entre 0");
		}
	}

}
