package org.generation.db_farmacia.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // criando uma identidade
@Table(name = "tb_produto") // criando uma tabela com o nome escolhido

public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //transformando esse atributo em chave primaria
	private Long id;
	
	@NotNull // Atributo não pode ir vazio
	@Size(min = 2, max = 50)
	private String nome;
	
	@Size(min = 5, max = 100)
	private String descricao;
	
	@NotNull
	@Size(min = 4, max = 20)
	private int codBarras;
	
	@NotNull
	private Double valor;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date vencimento;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(int codBarras) {
		this.codBarras = codBarras;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

}
