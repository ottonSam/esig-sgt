package com.ottonsam.sgt.service;


import java.io.Serializable;

import javax.inject.Inject;

import com.ottonsam.sgt.model.Tarefa;
import com.ottonsam.sgt.repository.Tarefas;
import com.ottonsam.sgt.util.Transacional;


public class CadastroTarefaService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private Tarefas tarefas;

    @Transacional
    public void salvar(Tarefa tarefa) {
        tarefas.guardar(tarefa);
    }

    @Transacional
    public void excluir(Tarefa tarefa) {
        tarefas.remover(tarefa);
    }

}