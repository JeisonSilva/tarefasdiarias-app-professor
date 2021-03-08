package com.example.tarefasdiarias.gestaotarefas.fragments;

import com.example.tarefasdiarias.gestaotarefas.dtos.NovaTarefaDto;

public interface InclusaoTarefaDal {
    void criarNovaTarefa(NovaTarefaDto novaTarefaDto);
}
