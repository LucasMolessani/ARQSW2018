package br.usjt.arqsw.dao;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.usjt.arqsw.entity.Usuario;
/**
 * 
 * @author Lucas Vasconcelos Molessani - 201508392
 * CCP3AN-MCA 
 * Arquitetura de software
 */
@Repository
public class UsuarioDAO {

	@PersistenceContext
	private EntityManager manager;
	/**
	 * M�todo que obtem um usu�rio atrav�s do nome
	 * @param userName
	 * @return Usuario
	 * @throws IOException
	 */
	public Usuario obterPorUsuario(String userName) throws IOException {
		return (Usuario) manager.createQuery("select u from Usuario u Where u.username = ?").setParameter(1, userName).getSingleResult();
	}
}