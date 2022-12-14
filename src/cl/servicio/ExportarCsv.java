package cl.servicio;

import java.util.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import cl.modelo.Cliente;

public class ExportarCsv extends Exportador{

	@Override
	public void exportar(String fileName, List<Cliente> listaClientes) throws IOException{
		//Crear Carpeta
		
		File carpeta = new File("src/SistemaClientes");
		if(!carpeta.exists()) {
			carpeta.mkdirs();
		}
		
		//Crear Archivo
		File archivo = new File("src/SistemaClientes/"+fileName);
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
			memoriaEscritura.write(cliente.getRunCliente()
							  +","+cliente.getNombreClente()
							  +","+cliente.getApellidoCliente()
							  +","+cliente.getAniosCliente()
							  +","+cliente.getNombreCategoria()+"\n");
		}
		memoriaEscritura.close();
	}

}









