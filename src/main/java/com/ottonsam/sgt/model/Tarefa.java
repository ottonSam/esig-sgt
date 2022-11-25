package com.ottonsam.sgt.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tarefas")
public class Tarefa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Override
	public String toString() {
		return "Tarefa [id=" + id + "]";
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getResponsavel() {
		return responsavel;
	}


	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}


	public String getPrioridade() {
		return prioridade;
	}


	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}


	public String getDeadLine() {
		return deadLine;
	}


	public void setDeadLine(String deadLine) {
		this.deadLine = deadLine;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(id, other.id);
	}
	
	@Column(name = "concluida")
	private Boolean concluida = false;
	
	public Boolean getConcluida() {
		return concluida;
	}


	public void setConcluida(Boolean concluida) {
		this.concluida = concluida;
	}

	@Column(name = "titulo", nullable = false, length = 240)
	private String titulo;
	
	@Column(name = "descricao", nullable = false, length = 240)
	private String descricao;
	
	@Column(name = "responsavel", nullable = false, length = 80)
	private String responsavel;
	
	@Column(name = "prioridade", nullable = false, length = 40)
	private String prioridade;
	
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Column(name = "dead_line")
	private String deadLine;
}
