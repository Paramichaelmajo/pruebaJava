package cl.vista;
import java.util.Scanner;

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
		System.out.println("1. Listar Clientes");
		System.out.println("2. Agregar Cliente");
		System.out.println("3. Editar Cliente");
		System.out.println("4. Cargar Datos");
		System.out.println("5. Exportar Datos");
		System.out.println("6. Salir");
	}
	
	public void listarCliente() {//Aqui se invoca al otro metodo pasandole un cliente
		//muestra lista de clientes agregados, 
		//ya sea por importación o agregando a mano.
		
	}
	
	public void agregarCliente() {
		//solicita ingreso de datos y llena objeto de tipo Cliente.
	}
	
	public void editarCliente() {
		//permite la edición de algún cliente en caso de requerirlo 
		//o cambiar el estado del cliente.
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
