package br.usjt.arqsw.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
/**
 * 
 * @author Lucas Vasconcelos Molessani - 201508392
 * CCP3AN-MCA 
 * Arquitetura de software
 *
 */
@Entity
@Table(name = "FILA")
public class Fila implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@NotNull(message="A fila n�o pode ser vazia.")
	@Min(value=1, message="A fila n�o pode ser vazia.")
	@Id
	@Column(name = "ID_FILA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "NM_FILA")
	private String nome;
	
	@Column(name = "CAMINHO_FIGURA")
	private String caminhoFigura;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCaminhoFigura() {
		return caminhoFigura;
	}
	public void setCaminhoFigura(String caminhoFigura) {
		this.caminhoFigura = caminhoFigura;
	}
	@Override
	public String toString() {
		return "Fila [id=" + id + ", nome=" + nome + "]";
	}
	
}
