package com.algaworks.socialbooks.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "livro")
public class Livro {
	
	private Long id;
	private String nome;
	private Date publicacao;
	private String editora;
	private String resumo;
	private List<Comentario> comentarios;
	private String autor;
	
	public Livro() {}
	
	public Livro(String nome) {
		this.nome = nome;
	}
	
	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	@JsonInclude(Include.NON_NULL)
	public Date getPublicacao() {
		return publicacao;
	}
	public void setPublicacao(Date publicacao) {
		this.publicacao = publicacao;
	}
	
	@JsonInclude(Include.NON_NULL)
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	@JsonInclude(Include.NON_NULL)
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	
	@JsonInclude(Include.NON_NULL)
	@Transient
	public List<Comentario> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	
	@JsonInclude(Include.NON_NULL)
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
