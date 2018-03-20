package br.usjt.arqsw.service;

import java.io.IOException;
import java.util.ArrayList;

import br.usjt.arqsw.dao.FilaDAO;
import br.usjt.arqsw.entity.Fila;

/** Classe de serviço Fila
 * @author	Lucas Vasconcelos Molessani
 * @version 1.00
 * @since   Release Inicial
 */
public class FilaService {
	private FilaDAO dao;
	
	/** Construtor da classe
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 */	
	public FilaService() {
		dao = new FilaDAO();
	}
	
	/** Retorna uma lista de filas
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @param	
	 * @return 	ArrayList<Fila>
	 */	
	public ArrayList<Fila> listarFilas() throws IOException{
		return dao.listarFilas();
	}
	
	/** Carrega
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @param	id
	 * @return 	
	 */	
	public Fila carregar(int id) throws IOException{		
		return dao.carregar(id);
	}
}
