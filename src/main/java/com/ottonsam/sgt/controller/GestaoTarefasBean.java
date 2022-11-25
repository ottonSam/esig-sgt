package com.ottonsam.sgt.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.ottonsam.sgt.model.Tarefa;
import com.ottonsam.sgt.repository.Tarefas;
import com.ottonsam.sgt.service.CadastroTarefaService;
import com.ottonsam.sgt.util.FacesMessages;

@Named
@ViewScoped
public class GestaoTarefasBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Inject
    private Tarefas tarefas;
    
    @Inject
    private CadastroTarefaService cadastroTarefaService;
    
    @Inject
    private FacesMessages messages;
    
    private List<Tarefa> listaTarefas;
    
    private Tarefa tarefa = new Tarefa();
    
    private String termoPesquisa;
    
    public void salvar() {
    	cadastroTarefaService.salvar(tarefa);
    	tarefa = new Tarefa();
    }
    
    public void pesquisar() {
        listaTarefas = tarefas.pesquisar(termoPesquisa);
        
        if (listaTarefas.isEmpty()) {
            messages.info("Sua consulta não retornou registros.");
        }
    }
    
    public void todasTarefas() {
        listaTarefas = tarefas.todas();
    }
    
    public List<Tarefa> getListaTarefas() {
        return listaTarefas;
    }
    
    public String getTermoPesquisa() {
        return termoPesquisa;
    }
    
    public void setTermoPesquisa(String termoPesquisa) {
        this.termoPesquisa = termoPesquisa;
    }
    
    public Tarefa getTarefa() {
		return tarefa;
	}
    
}
