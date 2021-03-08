package com.example.tarefasdiarias.gestaotarefas.fragments;

import com.example.tarefasdiarias.gestaotarefas.dtos.EdicaoTarefaDto;

public interface PesquisaTarefaDal {
    void carregarTarefaPorId(EdicaoTarefaDto edicao);
}
