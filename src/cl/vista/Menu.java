package cl.vista;
import java.util.Scanner;

import cl.modelo.CategoriaEnum;
import cl.modelo.Cliente;
import cl.servicio.ArchivoServicio;
import cl.servicio.ClienteServicio;

public class Menu {
	ClienteServicio clienteServicio = new ClienteServicio();
	ArchivoServicio archivoServicio = new ArchivoServicio();
	Scanner scaner = new Scanner(System.in);
	String fileName = "Clientes";
	String fileName1 = "DBClientes.csv";
	
	//void listarCliente();
	
	public void iniciarMenu() {
		boolean salir = false;
		while(!salir) {
			System.out.println("1. Listar Clientes");
			System.out.println("2. Agregar Cliente");
			System.out.println("3. Editar Cliente");
			System.out.println("4. Cargar Datos");
			System.out.println("5. Exportar Datos");
			System.out.println("6. Salir");
			System.out.printf("Ingrese una opcion: ");
			String opcion = scaner.nextLine();
			switch (opcion){
				case "1":{
					System.out.println("1. Listar Clientes");
					listarCliente();
					break;
				}
				
				case "2":{
					System.out.println("2. Agregar Cliente");
					agregarCliente();
					break;
				}	
				
				case "3":{
					System.out.println("3. Editar Cliente");
					editarCliente();
					break;
				}	
				
				case "4":{
					System.out.println("4. Cargar Datos");
					break;
				}	
				
				case "5":{
					System.out.println("5. Exportar Datos");
					break;
				}	
				
				case "6":{
					System.out.println("6. Salir");
					salir = true;
					break;
				}	
			}
		}
	}
	
	public void listarCliente() {
		clienteServicio.retornolistarClientes();
	}
	
	public void agregarCliente() {//Aqui se invoca al otro metodo pasandole un cliente
		//solicita ingreso de datos y llena objeto de tipo Cliente.
		System.out.println("-------------Crear Cliente-------------");
		System.out.println("Ingresa RUN del Cliente:");
		String runCliente = scaner.nextLine();
		System.out.println("Ingresa Nombre del Cliente:");
		String nombreCliente = scaner.nextLine();
		System.out.println("Ingresa Apellido del Cliente:");
		String apellidoCliente = scaner.nextLine();
		System.out.println("Ingresa años como Cliente:");
		String aniosCliente = scaner.nextLine();
		System.out.println("---------------------------------------");
		clienteServicio.agregarCliente(runCliente, nombreCliente,
				apellidoCliente, aniosCliente);
	}
	
	public void editarCliente() {
		//permite la edición de algún cliente en caso de requerirlo 
		//o cambiar el estado del cliente.
		System.out.println("--------------------Editar Cliente--------------------");
		System.out.println("Seleccione qué desea hacer:");
		System.out.println("1.-Si desea cambiar el estado del Cliente a Inactivo");
		System.out.println("2.-Si desea mantener el estado del cliente Activo");
		System.out.println("");
		System.out.println("Ingrese opcion:");
		System.out.println("------------------------------------------------------");
		System.out.println("----------- Editar cliente------------");
		System.out.println("Seleccione qué desea hacer: ");
		System.out.println("1.-Cambiar el estado del Cliente");
		System.out.println("2.-Editar los datos ingresados del Cliente");
		System.out.println("Ingrese opción");
		String opcion = scaner.nextLine();
		System.out.println("---------------------------------");
		Cliente cliente = new Cliente();
		switch(opcion) {
		case "1":
			System.out.println("Ingrese RUN del Cliente a editar:");
			String run = scaner.nextLine();
			clienteServicio.editarCliente(run, opcion);
			break;
		case "2":
			System.out.println("Ingrese RUN del Cliente a editar:");
			String run2 = scaner.nextLine();
			clienteServicio.editarCliente(run2, opcion);
			break;
		default:
			break;
		}

	}
	
	
	
	
	
	public void importarDatos() {
		//ejecuta la carga de datos del archivo “DBClientes.csv”.
	}
	
	public void exportarDatos() {
		//llama a método para exportar clientes en formato “.txt” o “.csv”.
	}
	
	public void terminarPrograma() {
		//termina el programa
	}
}
