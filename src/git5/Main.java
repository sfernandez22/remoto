package git5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		ArrayList<String> datosEstudiantes = new ArrayList<String>();
		System.out.println("Dime tu nombre: ");
		String nombre = sc.nextLine();
		datosEstudiantes.add(nombre);
		System.out.println("Dime tus apellidos: ");
		String apellidos = sc.nextLine();
		datosEstudiantes.add(apellidos);
		System.out.println("Dame tu fecha de nacimineto: ");
		String fecha_nacimineto = sc.nextLine();
		datosEstudiantes.add(fecha_nacimineto);
		System.out.println("Dame tu DNI: ");
		String dni = sc.nextLine();
		datosEstudiantes.add(dni);
		System.out.println("Dime tus estudios previos: ");
		String estudios_previos = sc.nextLine();
		datosEstudiantes.add(estudios_previos);
		System.out.println("Dime tu telefono: ");
		String telefono = sc.nextLine();
		datosEstudiantes.add(telefono);
		
	}

}
