package cl.servicio;

import java.util.ArrayList;
import java.util.List;

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
	
	public void retornolistarClientes() {
		//Recorrer clientes
	}
	
	public void agregarCliente(Cliente cliente) {
		//Aqui se agrega al final
	}
	
	public void editarCliente(Cliente cliente) {
		
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}
	
	
}
