package com.example.tarefasdiarias.gestaotarefas.fragments;

import com.example.tarefasdiarias.gestaotarefas.dtos.TarefaEmDigitacaoDto;

public interface ListaTarefasDal {
    void carregarTarefasEmEdicao(TarefaEmDigitacaoDto[] tarefasEmDigitacao);
}
