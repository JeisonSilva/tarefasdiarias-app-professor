package com.example.tarefasdiarias.gestaotarefas.fragments;

import com.example.tarefasdiarias.gestaotarefas.dtos.EdicaoTarefaDto;
import com.example.tarefasdiarias.gestaotarefas.dtos.NovaTarefaDto;

public interface ManutencaoDadosTarefaDal {
    void excluir(int id);
    void enviarTarefaParaAluno(int id);

}
