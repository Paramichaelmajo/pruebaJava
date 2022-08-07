package cl.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cl.modelo.CategoriaEnum;
import cl.modelo.Cliente;
import cl.utilidades.Utilidad;

public class ClienteServicio {
	Utilidad utilidad = new Utilidad();
	List<Cliente> listaClientes = new ArrayList<Cliente>();

	public ClienteServicio() {
	}
	
	public ClienteServicio(List<Cliente> listaClientes) {
		super();
		this.listaClientes = listaClientes;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}
	//ArrayList<Cliente> clienteList = new ArrayList<Cliente>();
	
	public void retornolistarClientes() {
		for(Cliente cli: listaClientes) {
			System.out.println("\n-------------Datos del Cliente-------------");
			System.out.println("");
			System.out.println("RUN del Cliente: "+ cli.getRunCliente());
			System.out.println("Nombre del Cliente: "+ cli.getNombreClente());
			System.out.println("Apellido del Cliente: "+ cli.getApellidoCliente());
			System.out.println("Años como Cliente: "+ cli.getAniosCliente());
			System.out.println("Categoría del Cliente: "+ cli.getNombreCategoria());
			System.out.println("");			
			System.out.println("-------------------------------------------");
		}
	}
	
	public void agregarCliente(String run, String nombre, 
			String apellido, String edad) {
		Cliente cliente = new Cliente(run, nombre, apellido
				, edad, CategoriaEnum.Activo);
		listaClientes.add(cliente);
		System.out.println("Cliente Agregado.");
		utilidad.esperarTecla();
		
	}
	
	public void editarCliente(String run, String opcion) {
		Scanner scaner = new Scanner(System.in);
		switch(opcion) {
		case "1"://Cambiar estado
			boolean existeRun1 = true;
			for(Cliente cli: listaClientes) {
				
				if(cli.getRunCliente().equals(run)){
					CategoriaEnum categoria = CategoriaEnum.Activo;
					if(cli.getNombreCategoria().equals(categoria)) {
						categoria = CategoriaEnum.Inactivo;
					}else{
						categoria = CategoriaEnum.Activo;
					}
					System.out.println("\n-----Actualizando estado del Cliente----");
					System.out.println("El estado actual es: "+ cli.getNombreCategoria());
					System.out.println("1.-Si desea cambiar el estado del Cliente a "+categoria);
					System.out.println("2.-Si desea mantener el estado del cliente "
										+cli.getNombreCategoria());
					System.out.println("----------------------------------------");
					System.out.printf("\nIngrese opcion:");
					String opci = scaner.nextLine();
					switch(opci) {
						case "1":
							if(cli.getNombreCategoria() == CategoriaEnum.Activo) {
								cli.setNombreCategoria(CategoriaEnum.Inactivo);
							}else {
								cli.setNombreCategoria(CategoriaEnum.Activo);
							}
							System.out.println("Datos cambiados con éxito");
							break;
						case "3":
							System.out.println("Volviendo a menu");
							break;
						default:
							System.out.println("Opcion incorrecta");
							utilidad.limpiarPantalla();
					}
					existeRun1 = true;
					break;
				}else{
					existeRun1 = false;
				}				
			}
			if(!existeRun1) {
				System.out.println("Run no EXISTE.");
			}
			break;
		case "2":
			boolean existeRun2 = true;
			for(Cliente cli: listaClientes) {
				if(cli.getRunCliente().equals(run)){
					System.out.println("\n-----Actualizando estado del Cliente----");
					System.out.println("");
					System.out.println("1.-El RUN del Cliente es: "+cli.getRunCliente());
					System.out.println("2.-El Nombre del Cliente es: "+cli.getNombreClente());
					System.out.println("3.-El Apellido del Cliente es: "+cli.getApellidoCliente());
					System.out.println("4.-Los años como Cliente son: "+ cli.getAniosCliente() +"años");
					System.out.println("\n----------------------------------------");
					System.out.printf("Ingrese opcion a editar de los datos del cliente:");
					String opci = scaner.nextLine();
					switch(opci) {
						case "1":
							System.out.println("\n----------------------------------------");
							System.out.println("1.-Ingrese nuevo RUN del Cliente:");
							String nuevoRun = scaner.nextLine();
							System.out.println("----------------------------------------");
							cli.setRunCliente(nuevoRun);
							System.out.println("Datos cambiados con éxito");
							existeRun2 = true;
							break;
						case "2":
							System.out.println("----------------------------------------");
							System.out.println("1.-Ingrese nuevo NOMBRE del Cliente:");
							String nuevoNombre = scaner.nextLine();
							System.out.println("----------------------------------------");
							cli.setNombreClente(nuevoNombre);
							System.out.println("Datos cambiados con éxito");
							existeRun2 = true;
							break;
						case "3":
							System.out.println("----------------------------------------");
							System.out.println("1.-Ingrese nuevo APELLIDO del Cliente:");
							String nuevoApellido = scaner.nextLine();
							System.out.println("----------------------------------------");
							cli.setApellidoCliente(nuevoApellido);
							System.out.println("Datos cambiados con éxito");
							existeRun2 = true;
							break;
						case "4":
							System.out.println("----------------------------------------");
							System.out.println("1.-Ingrese nuevo AÑOS del Cliente:");
							String nuevoAnios = scaner.nextLine();
							System.out.println("----------------------------------------");
							cli.setAniosCliente(nuevoAnios);
							System.out.println("Datos cambiados con éxito");
							existeRun2 = true;
							break;
						default:
							System.out.println("Opcion incorrecta");
					}
				}else{
					existeRun2 = false;
				}				
			}
			if(!existeRun2) {
				System.out.println("Run no EXISTE.");
			}
			break;
		default:
			break;
		}
		utilidad.esperarTecla();
	}

	
	
}
