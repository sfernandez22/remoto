package git5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		Estudiante estudiante = new Estudiante();
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		System.out.println("Dime tu nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Dime tus apellidos: ");
		String apellidos = sc.nextLine();
		System.out.println("Dame tu fecha de nacimineto: ");
		String fecha_nacimiento = sc.nextLine();
		System.out.println("Dame tu DNI: ");
		String dni = sc.nextLine();
		System.out.println("Dime tus estudios previos: ");
		String estudios_previos = sc.nextLine();
		System.out.println("Dime tu telefono: ");
		String telefono = sc.nextLine();
		estudiante = new Estudiante(nombre, apellidos, fecha_nacimiento, dni, estudios_previos, telefono);
		estudiantes.add(estudiante);
	}
}
