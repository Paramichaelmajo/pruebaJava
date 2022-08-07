package cl.vista;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import cl.modelo.CategoriaEnum;
import cl.modelo.Cliente;
import cl.servicio.ArchivoServicio;
import cl.servicio.ClienteServicio;
import cl.servicio.ExportarCsv;
import cl.servicio.ExportarTxt;
import cl.utilidades.Utilidad;

public class Menu {
	ClienteServicio clienteServicio = new ClienteServicio();
	ArchivoServicio archivoServicio = new ArchivoServicio();
	ExportarCsv exportarCsv = new ExportarCsv();
	ExportarTxt exportarTxt = new ExportarTxt();
	
	Utilidad utilidad = new Utilidad();
	
	Scanner scaner = new Scanner(System.in);
	String fileName = "Clientes";
	String fileName1 = "DBClientes.csv";
	
	//void listarCliente();
	
	public void iniciarMenu(){
		boolean salir = false;
		while(!salir) {
			utilidad.menuPrincipal();
			String opcion = scaner.nextLine();
			switch (opcion){
				case "1":{
					listarCliente();
					utilidad.esperarTecla();
					break;
				}
				
				case "2":{
					agregarCliente();
					break;
				}	
				
				case "3":{
					editarCliente();
					break;
				}	
				
				case "4":{
					System.out.println("4. Cargar Datos");
					break;
				}	
				
				case "5":{
					exportarDatos();
					System.out.println("Datos exportados.");
					utilidad.esperarTecla();
					break;
				}	
				
				case "6":{
					terminarPrograma();
					salir = true;
					break;
				}
				default:{
					System.out.println("Opcion incorrecta");
				}
			}
			utilidad.limpiarPantalla();
		}
	}
	
	public void listarCliente() {
		clienteServicio.retornolistarClientes();
	}
	
	public void agregarCliente() {
		boolean validacion = false;
		System.out.println("\n-------------Crear Cliente-------------");
		System.out.println("Ingresa RUN del Cliente:");
		String runCliente = scaner.nextLine();
		System.out.println("Ingresa Nombre del Cliente:");
		String nombreCliente = scaner.nextLine();
		System.out.println("Ingresa Apellido del Cliente:");
		String apellidoCliente = scaner.nextLine();
		String anios ="";
		do {
			System.out.println("Ingresa años como Cliente:");
			String aniosCliente = scaner.nextLine();
			if(utilidad.validarNumero(aniosCliente) == false || Integer.parseInt(aniosCliente)<0) {
				System.out.println("------------------------------------------------------------------------");
				System.out.println("Solo ingresar numeros positivos ");
				validacion = false;
			}else {
				anios = aniosCliente;
				validacion = true;
			}
		}while(validacion = !validacion);
		System.out.println("---------------------------------------");
		clienteServicio.agregarCliente(runCliente, nombreCliente,
				apellidoCliente, anios);
	}
	
	public void editarCliente() {
		utilidad.menuEditarCliente();
		String opcion = scaner.nextLine();
		System.out.println("\n---------------------------------");
		Cliente cliente = new Cliente();
		switch(opcion) {
		case "1"://Cambiar estado
			System.out.println("Ingrese RUN del Cliente a editar:");
			String run = scaner.nextLine();
			clienteServicio.editarCliente(run, opcion);
			break;
		case "2"://Cambiar datos Cliente
			System.out.println("Ingrese RUN del Cliente a editar:");
			String run2 = scaner.nextLine();
			clienteServicio.editarCliente(run2, opcion);
			break;
		default:
			System.out.println("Opcion incorrecta");
			utilidad.limpiarPantalla();
		}

	}
	
	public void importarDatos() {
		//ejecuta la carga de datos del archivo “DBClientes.csv”.
	}
	
	public void exportarDatos() {
		utilidad.menuExportar();
		String opcionExportar = scaner.nextLine();
		switch(opcionExportar) {
			case "1":
				try {
					System.out.println("Creando CSV");
					exportarCsv.exportar(fileName1, clienteServicio.getListaClientes());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case "2":
				try {
					System.out.println("Creando TXT");
					exportarTxt.exportar(fileName, clienteServicio.getListaClientes());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			default:{
				System.out.println("Opcion incorrecta");
				utilidad.limpiarPantalla();
			}
		}
	}
	
	public void terminarPrograma() {
		utilidad.limpiarPantalla();
		System.out.println("Terminando Programa.....");
		System.exit(0);
	}
}
