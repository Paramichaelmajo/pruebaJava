package cl.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cl.modelo.CategoriaEnum;
import cl.modelo.Cliente;

public class ClienteServicio {
	List<Cliente> listaClientes;

	public ClienteServicio() {
	}
	
	public ClienteServicio(ArrayList<Cliente> listaClientes) {
		super();
		this.listaClientes = listaClientes;
	}
	/*
	public ClienteServicio(List<Cliente> listaClientes) {
		super();
		this.listaClientes = new ArrayList<Cliente>();
		//this.listaClientes = new ArrayList<>();
	}*/
	ArrayList<Cliente> clienteList = new ArrayList<Cliente>();
	
	public List<Cliente> getListaClientes() {
		return listaClientes;
	}
	
	public void retornolistarClientes() {
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
		
	}
	
	public void agregarCliente(String run, String nombre, 
			String apellido, String edad) {
		Cliente cliente = new Cliente(run, nombre, apellido
				, edad, CategoriaEnum.Activo);
		clienteList.add(cliente);

		
		//clienteList.add(cliente.setRunCliente());
		//clienteList.add(cliente.setNombreClente());
		//clienteList.add(cliente.setApellidoCliente());
		//clienteList.add(cliente.setAniosCliente());
		//clienteList.add(cliente.setNombreCategoria().toString());
		
		
		//Probando con Streams
		//clienteList.forEach(System.out::println);
		/*
		for(String cadena: clienteList) {
			System.out.println(cadena.);
		}
		*/
	}
	
	public void editarCliente(String run, String opcion) {
		Scanner scaner = new Scanner(System.in);
		switch(opcion) {
		case "1"://
			for(Cliente cli: clienteList) {
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
			//System.out.println("existe");
			//System.out.println(cli.getRunCliente());
			break;
		default:
			break;
		}
	}

	
	
}
