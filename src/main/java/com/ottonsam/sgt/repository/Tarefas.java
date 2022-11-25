package com.ottonsam.sgt.repository;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.ottonsam.sgt.model.Tarefa;

public class Tarefas implements Serializable {

	private static final long serialVersionUID = 1L;

	private EntityManager manager;

	public Tarefas() {

	}

	public Tarefas(EntityManager manager) {
		this.manager = manager;
	}

	public Tarefa porId(Long id) {
		return manager.find(Tarefa.class, id);
	}

	public List<Tarefa> pesquisar(String nome) {
		String jpql = "from Tarefa where nomeFantasia like :nome";

		TypedQuery<Tarefa> query = manager.createQuery(jpql, Tarefa.class);

		query.setParameter("nome", nome + "%");

		return query.getResultList();
	}
	
	public List<Tarefa> todas() {
        return manager.createQuery("from Tarefa", Tarefa.class).getResultList();
	}
	
	public Tarefa guardar(Tarefa tarefa) {
		return manager.merge(tarefa);
	}

	public void remover(Tarefa tarefa) {
		tarefa = porId(tarefa.getId());
		manager.remove(tarefa);
	}

}