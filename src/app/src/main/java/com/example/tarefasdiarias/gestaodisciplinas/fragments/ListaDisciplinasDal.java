package com.example.tarefasdiarias.gestaodisciplinas.fragments;

import com.example.tarefasdiarias.gestaodisciplinas.DisciplinaDto;

public interface ListaDisciplinasDal {
    void carregarDisciplinas(DisciplinaDto[] disciplinasDtos);
}
