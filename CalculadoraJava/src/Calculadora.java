import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Menu();
	}

	public static void Menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué operación deseas realizar?");
		System.out.println("1-Suma");
		System.out.println("2-Resta");
		System.out.println("3-Multiplicación");
		System.out.println("4-División");
		System.out.println("5-Seno");
		System.out.println("6-Coseno");
		System.out.println("7-Potencia");
		System.out.println("8-Raiz");
		System.out.println("9-Logaritmo");
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
			Seno();
			break;
		case 6:
			Coseno();
			break;
		case 7:
			//Potencia();
			break;
		case 8:
			//Raiz();
			break;
		case 9:
			Logaritmo();
			
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
	
	private static double customLog(double base, double logNumber) {
	    return Math.log(logNumber) / Math.log(base);
		}	
	
	public static void Logaritmo() {
		double base, num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número al que calcular el logaritmo: ");
		num1= sc.nextInt();
		System.out.println("Introduce la base del logaritmo: ");
		base= sc.nextInt();
		System.out.println(customLog(base, num1));
		
	}
	
	public static void Seno() {
		double angulo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el angulo al que calcular el seno: ");
		angulo= sc.nextInt();
		System.out.println("Seno de "+angulo+" = " + java.lang.Math.sin(angulo));
		
	}
	
	public static void Coseno() {
		double angulo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el angulo al que calcular el coseno: ");
		angulo= sc.nextInt();
		System.out.println("Seno de "+angulo+" = " + java.lang.Math.cos(angulo));
	}
	
	

}
