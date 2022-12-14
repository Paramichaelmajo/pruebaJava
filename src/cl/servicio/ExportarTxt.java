package cl.servicio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import cl.modelo.Cliente;

public class ExportarTxt extends Exportador{

	@Override
	public void exportar(String fileName, List<Cliente> listaClientes) throws IOException {
		//Crear Carpeta
		
		File carpeta = new File("src/SistemaClientes");
		if(!carpeta.exists()) {
			carpeta.mkdirs();
		}
		
		//Crear Archivo
		File archivo = new File("src/SistemaClientes/"+fileName+".txt");
		if(!archivo.exists()) {
			try {
				archivo.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			}	
		
		//Escribir en archivo
		FileWriter escribeArchivo = new FileWriter(archivo);
		BufferedWriter memoriaEscritura = new BufferedWriter(escribeArchivo);

		for(Cliente cliente: listaClientes) {
			memoriaEscritura.write("-------------Datos del Cliente-------------\n");
			memoriaEscritura.write("RUN del Cliente: "+ cliente.getRunCliente()+"\n"
								  +"Nombre del Cliente: "+ cliente.getNombreClente()+"\n"
								  +"Apellido del Cliente: "+ cliente.getApellidoCliente()+"\n"
								  +"Años como Cliente: "+ cliente.getAniosCliente()+"\n"
								  +"Categoría del Cliente: "+ cliente.getNombreCategoria()+"\n"
								  +"-------------------------------------------\n\n");
		}
		memoriaEscritura.close();
	}

}












