package com.example.tarefasdiarias;

import android.view.MenuItem;

import com.example.tarefasdiarias.gestaoalunos.fragments.ListaAlunosDal;
import com.example.tarefasdiarias.gestaodisciplinas.fragments.ListaDisciplinasDal;
import com.example.tarefasdiarias.gestaologin.dtos.PerfilDto;

public interface HomeDal {
    void listarTarefasEmDigitacao();
    void exibirTela(MenuItem item);

    PerfilDto obterPerfil();

    void listarDisiplinas(ListaDisciplinasDal listaDisciplinasDal);

    void listarAlunosMatriculados(ListaAlunosDal listaAlunosDal);
}
