package br.usjt.arqsw.service;

import java.io.IOException;
import java.util.ArrayList;

import br.usjt.arqsw.dao.ChamadoDAO;
import br.usjt.arqsw.entity.Chamado;
import br.usjt.arqsw.entity.Fila;

/** Classe de serviço chamado
 * @author	Lucas Vasconcelos Molessani
 * @version 1.00
 * @since   Release Inicial
 */	
public class ChamadoService {
	
	private ChamadoDAO dao;
	
	/** Construtor da classe
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 */	
	public ChamadoService() {
		dao = new ChamadoDAO();
	}
	
	
	/** Retorna uma lista de Chamados cadastrados de acordo com uma Fila
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @param	Fila
	 * @return 
	 */	
	public ArrayList<Chamado> listarChamados(Fila fila) throws IOException{		
		return dao.listarChamados(fila);
	}
	
	/** Inclui Chamados cadastrados de acordo com uma Fila
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @param	chamado
	 * @return 
	 */	
	
	public int incluirChamado(Chamado chamado) throws IOException {
		return dao.incluir(chamado);
	}

}
