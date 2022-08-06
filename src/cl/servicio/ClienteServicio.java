package cl.servicio;

import java.util.ArrayList;
import java.util.List;

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
		
		//listaClientes.add(cliente);
		
		//Probando con Streams
		//clienteList.forEach(System.out::println);
		/*
		for(String cadena: clienteList) {
			System.out.println(cadena.);
		}
		*/
	}
	
	public void editarCliente(Cliente cliente) {
		
	}

	
	
}
