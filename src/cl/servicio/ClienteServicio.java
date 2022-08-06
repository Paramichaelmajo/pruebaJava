package cl.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cl.modelo.CategoriaEnum;
import cl.modelo.Cliente;

public class ClienteServicio {
	//List<Cliente> listaClientes;
	List<Cliente> listaClientes = new ArrayList<Cliente>();

	public ClienteServicio() {
	}
	
	public ClienteServicio(List<Cliente> listaClientes) {
		super();
		this.listaClientes = listaClientes;
	}
	/*
	public ClienteServicio(ArrayList<Cliente> listaClientes) {
		super();
		this.listaClientes = listaClientes;
	}
	*/

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}
	//ArrayList<Cliente> clienteList = new ArrayList<Cliente>();
	
	public void retornolistarClientes() {
		for(Cliente cli: listaClientes) {
			System.out.println("-------------Datos del Cliente-------------");
			System.out.println("");
			System.out.println("RUN del Cliente: "+ cli.getRunCliente());
			System.out.println("Nombre del Cliente: "+ cli.getNombreClente());
			System.out.println("Apellido del Cliente: "+ cli.getApellidoCliente());
			System.out.println("Años como Cliente: "+ cli.getAniosCliente());
			System.out.println("Categoría del Cliente: "+ cli.getNombreCategoria());
			System.out.println("");			
			System.out.println("-------------------------------------------");
		}
		/*
		for(Cliente cli: clienteList) {
			System.out.println("-------------Datos del Cliente-------------");
			System.out.println("");
			System.out.println("RUN del Cliente: "+ cli.getRunCliente());
			System.out.println("Nombre del Cliente: "+ cli.getNombreClente());
			System.out.println("Apellido del Cliente: "+ cli.getApellidoCliente());
			System.out.println("Años como Cliente: "+ cli.getAniosCliente());
			System.out.println("Categoría del Cliente: "+ cli.getNombreCategoria());
			System.out.println("");			
			System.out.println("-------------------------------------------");
		}
		*/
		
	}
	
	public void agregarCliente(String run, String nombre, 
			String apellido, String edad) {
		Cliente cliente = new Cliente(run, nombre, apellido
				, edad, CategoriaEnum.Activo);
		listaClientes.add(cliente);

		//listaClientes.add(cliente);
		
	}
	
	public void editarCliente(String run, String opcion) {
		Scanner scaner = new Scanner(System.in);
		switch(opcion) {
		case "1"://
			for(Cliente cli: listaClientes) {
				if(cli.getRunCliente().equals(run)){
					System.out.println("-----Actualizando estado del Cliente----");
					System.out.println("El estado actual es: "+ cli.getNombreCategoria());
					System.out.println("1.-Si desea cambiar el estado del Cliente a Inactivo");
					System.out.println("2.-Si desea mantener el estado del cliente "
										+cli.getNombreCategoria());
					System.out.println("");
					System.out.print("Ingrese opcion:");
					System.out.println("----------------------------------------");
					String opci = scaner.nextLine();
					switch(opci) {
						case "1":
							if(cli.getNombreCategoria() == CategoriaEnum.Activo) {
								cli.setNombreCategoria(CategoriaEnum.Inactivo);
							}else {
								cli.setNombreCategoria(CategoriaEnum.Activo);
							}
							break;
						case "2":
							System.out.println("Volviendo a menu");
							break;
					}
				}else{
					System.out.println("Run no existe.");
				}				
			}
			break;
		case "2":
			for(Cliente cli: listaClientes) {
				if(cli.getRunCliente().equals(run)){
					System.out.println("-----Actualizando estado del Cliente----");
					System.out.println("");
					System.out.println("1.-El RUN del Cliente es: "+cli.getRunCliente());
					System.out.println("2.-El Nombre del Cliente es: "+cli.getNombreClente());
					System.out.println("3.-El Apellido del Cliente es: "+cli.getApellidoCliente());
					System.out.println("4.-Los años como Cliente son: "+ cli.getAniosCliente() +"años");
					System.out.println("");
					System.out.printf("Ingrese opcion a editar de los datos del cliente:");
					System.out.println("----------------------------------------");
					String opci = scaner.nextLine();
					switch(opci) {
						case "1":
							System.out.println("----------------------------------------");
							System.out.println("1.-Ingrese nuevo RUN del Cliente:");
							String nuevoRun = scaner.nextLine();
							System.out.println("---------------------------------------- Datos cambiados con éxito");
							cli.setRunCliente(nuevoRun);
							break;
						case "2":
							System.out.println("----------------------------------------");
							System.out.println("1.-Ingrese nuevo NOMBRE del Cliente:");
							String nuevoNombre = scaner.nextLine();
							System.out.println("---------------------------------------- Datos cambiados con éxito");
							cli.setNombreClente(nuevoNombre);
							break;
						case "3":
							System.out.println("----------------------------------------");
							System.out.println("1.-Ingrese nuevo APELLIDO del Cliente:");
							String nuevoApellido = scaner.nextLine();
							System.out.println("---------------------------------------- Datos cambiados con éxito");
							cli.setApellidoCliente(nuevoApellido);
							break;
						case "4":
							System.out.println("----------------------------------------");
							System.out.println("1.-Ingrese nueva EDAD del Cliente:");
							String nuevoAnios = scaner.nextLine();
							System.out.println("---------------------------------------- Datos cambiados con éxito");
							cli.setAniosCliente(nuevoAnios);
							break;
					}
				}else{
					//System.out.println("Run no existe.");
				}				
			}
			break;
		default:
			break;
		}
	}

	
	
}
