package com.example.tarefasdiarias.gestaotarefas.fragments;

import com.example.tarefasdiarias.gestaotarefas.dtos.EdicaoTarefaDto;

public interface EdicaoTarefaDal {
    void editarTarefa(EdicaoTarefaDto tarefa);
    void carregarTarefa(PesquisaTarefaDal pesquisaTarefaDal, int tarefaId);
}
