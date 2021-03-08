package com.example.tarefasdiarias.gestaotarefas.fragments;

import com.example.tarefasdiarias.gestaotarefas.dtos.AlunoMatriculadoDto;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public interface AlunosMatriculadosDal {
    void carregarListaDeAlunos(AlunoMatriculadoDto[] alunoMatriculadoDtos);
}
