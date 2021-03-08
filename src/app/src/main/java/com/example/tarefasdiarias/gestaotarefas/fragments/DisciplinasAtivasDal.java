package com.example.tarefasdiarias.gestaotarefas.fragments;

import com.example.tarefasdiarias.gestaotarefas.dtos.DisciplinaDto;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public interface DisciplinasAtivasDal {
    void carregarDisciplinas(DisciplinaDto[] disciplinasDtos);
}
