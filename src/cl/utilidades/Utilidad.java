package cl.utilidades;

import java.util.Scanner;

public class Utilidad {
	public void limpiarPantalla() {
		for (int i = 0; i < 20; ++i) System.out.println();
	}
	
	public void esperarTecla() {
		Scanner tecla = new Scanner(System.in);
		System.out.print("Presione ENTER para continuar....");
		String enter = tecla.nextLine();
		
	}
	
	public void menuPrincipal() {
		System.out.println("1. Listar Clientes");
		System.out.println("2. Agregar Cliente");
		System.out.println("3. Editar Cliente");
		System.out.println("4. Cargar Datos");
		System.out.println("5. Exportar Datos");
		System.out.println("6. Salir");
		System.out.printf("Ingrese una opcion: ");
	}
	
	public void menuEditarCliente() {
		System.out.println("\n----------- Editar cliente------------");
		System.out.println("Seleccione qué desea hacer: ");
		System.out.println("1.-Cambiar el estado del Cliente");
		System.out.println("2.-Editar los datos ingresados del Cliente");
		System.out.println("Ingrese opción");
	}
	
	public void menuExportar() {
		System.out.println("\n---------Exportar Datos----------- "
				+ "\nSeleccione el formato a exportar:");
		System.out.println("1.-Formato csv");
		System.out.println("2.-Formato txt");
		System.out.println("");
		System.out.printf("Ingrese una opción para exportar: ");
	}
}
