package cl.servicio;

import java.io.IOException;
import java.util.List;

import cl.modelo.Cliente;

public abstract class Exportador {
	public abstract void exportar(String fileName, List<Cliente> listaClientes) throws IOException;
}
