package br.usjt.arqsw.controller;

import java.io.IOException;
import java.util.List;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.usjt.arqsw.entity.Chamado;
import br.usjt.arqsw.entity.Fila;
import br.usjt.arqsw.service.ChamadoService;
import br.usjt.arqsw.service.FilaService;


/** Classe para controlar as requisi��es do cliente com o servidor
 * @author	Lucas Vasconcelos Molessani
 * @version 1.00
 * @since   Release Inicial
 */
@Controller
public class ManterChamadosController {
	
	private FilaService filaService;
	private ChamadoService chamadoService;

	/** Construtor da Classe ManterChamados
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @param	Nenhum
	 * @return 	Nenhum
	 */
	public ManterChamadosController() {
		filaService = new FilaService();
		chamadoService = new ChamadoService();
	}

	/** Mapeando a requisi��o para pagina Index
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @param	Nenhum
	 * @return 	String
	 */
	@RequestMapping("index")
	public String inicio() {
		return "index";
	}

	/** Consulta e retorna as Filas de Servi�o
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @param	Nenhum
	 * @return 	List<Fila>
	 */
	private List<Fila> listarFilas() throws IOException{
			return filaService.listarFilas();
	}
	
	/** Consulta e retorna os Chamados de acordo com a Fila de Servi�o
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @param	Fila
	 * @return 	List<Chamado>
	 */
	private List<Chamado> listarChamados(Fila fila) throws IOException{
			return chamadoService.listarChamados(fila);
	}
	
	
	/** Mapeando a requisi��o para pagina de listar Filas
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @param	Model
	 * @return 	String
	 */	
	@RequestMapping("/listar_filas_exibir")
	public String listarFilasExibir(Model model) {
		try {
			model.addAttribute("filas", listarFilas());
			return "Chamado/ChamadoListar";
		} catch (IOException e) {
			e.printStackTrace();
			return "Erro";
		}
	}
	/** Mapeando a requisi��o para pagina de listar os chamados
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @param	Fila, BindingResult, Model
	 * @return 	String
	 */	
	@RequestMapping("/listar_chamados_exibir")
	public String listarChamadosExibir(@Valid Fila fila, BindingResult result, Model model) {
		try {
			if (result.hasFieldErrors("id")) {
				model.addAttribute("filas", listarFilas());
				System.out.println("Deu erro " + result.toString());
				return "Chamado/ChamadoListar";
			}
			fila = filaService.carregar(fila.getId());			
			model.addAttribute("fila", fila);			
			model.addAttribute("chamados", listarChamados(fila));
			
			return "Chamado/ChamadoListarExibir";

		} catch (IOException e) {
			e.printStackTrace();
			return "Erro";
		}
	}
	
	/** Mapeando a requisi��o para pagina de inclus�o de chamado
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @param	Fila, BindingResult, Model
	 * @return 	String
	 */	
	@RequestMapping("/novo_chamado")
	public String novoChamado(Model model) {
		try {
			model.addAttribute("filas", listarFilas());
			return "Chamado/IncluirChamado";
			
		}catch(IOException e) {
			e.printStackTrace();
			return "erro";
		}
	}
	
	/** Mapeando a requisi��o para pagina de inclus�o de chamado
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @param	Fila, BindingResult, Model
	 * @return 	String
	 */	
	@RequestMapping("/incluir_chamado")
	public String incluirChamado(@Valid Fila fila, @Valid Chamado chamado, BindingResult result, Model model) {
		try {
			if(result.hasFieldErrors("descricao")) {
				model.addAttribute("filas", listarFilas());
				System.out.println("Deu erro " + result.toString());
				return "Chamado/IncluirChamado";
			}
			chamado.setFila(fila);
			chamadoService.incluirChamado(chamado);			
			model.addAttribute("chamado", chamado);
			return "Chamado/VisualizarChamado";
			
		}catch(IOException e) {
			e.printStackTrace();
			return "erro";
		}
	}
}
