package com.algaworks.socialbooks.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
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
	private Autor autor;
	
	public Livro() {}
	
	public Livro(String nome) {
		this.nome = nome;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@NotEmpty(message = "O campo nome não pode ser vazio.")
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@JsonInclude(Include.NON_NULL)
	@JsonFormat(pattern = "dd/MM/yyyy")
	@NotNull(message = "Campo publicação é de preenchimento obrigatório.")
	public Date getPublicacao() {
		return publicacao;
	}
	public void setPublicacao(Date publicacao) {
		this.publicacao = publicacao;
	}
	
	@JsonInclude(Include.NON_NULL)
	@NotBlank(message = "Campo editora é de preenchimento obrigatório.")
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	@JsonInclude(Include.NON_NULL)
	@NotBlank(message = "O resumo deve ser preenchido.")
	@Size(max = 1500, message = "O resumo não pode conter mais de 1500 caracteres.")
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	
	@JsonInclude(Include.NON_EMPTY)
	@OneToMany(mappedBy = "livro")
	public List<Comentario> getComentarios() {
		return comentarios;
	}
	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	
	@ManyToOne
	@JoinColumn(name = "autor_id")
	@JsonInclude(Include.NON_NULL)
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
}
