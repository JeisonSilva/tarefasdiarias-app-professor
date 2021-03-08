package com.example.tarefasdiarias.gestaoalunos.fragments;

import com.example.tarefasdiarias.gestaotarefas.dtos.AlunoMatriculadoDto;

public interface ListaAlunosDal {
    void carregarListaDeAlunos(AlunoMatriculadoDto[] alunoMatriculadoDtos);
}
