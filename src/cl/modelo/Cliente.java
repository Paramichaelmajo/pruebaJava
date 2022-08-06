package cl.modelo;

public class Cliente {
	String runCliente;
	String nombreClente;
	String apellidoCliente;
	String aniosCliente;
	CategoriaEnum nombreCategoria;
	public Cliente() {
	}
	
	public Cliente(String runCliente, String nombreClente, String apellidoCliente, String aniosCliente,
			CategoriaEnum nombreCategoria) {
		super();
		this.runCliente = runCliente;
		this.nombreClente = nombreClente;
		this.apellidoCliente = apellidoCliente;
		this.aniosCliente = aniosCliente;
		this.nombreCategoria = nombreCategoria;
	}

	public String getRunCliente() {
		return runCliente;
	}

	public void setRunCliente(String runCliente) {
		this.runCliente = runCliente;
	}

	public String getNombreClente() {
		return nombreClente;
	}

	public void setNombreClente(String nombreClente) {
		this.nombreClente = nombreClente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	public String getAniosCliente() {
		return aniosCliente;
	}

	public void setAniosCliente(String aniosCliente) {
		this.aniosCliente = aniosCliente;
	}

	public CategoriaEnum getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(CategoriaEnum nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	@Override
	public String toString() {
		return "cliente [runCliente=" + runCliente + ", nombreClente=" + nombreClente + ", apellidoCliente="
				+ apellidoCliente + ", aniosCliente=" + aniosCliente + ", nombreCategoria=" + nombreCategoria + "]";
	}
}
