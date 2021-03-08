package com.example.tarefasdiarias.gestaotarefas.fragments;

public interface ListaTarefasEmDigitacaoDal {
    void exibirTelaParaCriarNovaTarefa();
    void exibirTelaParaEditarTarefa(int tarefaId);
    void exibirNotificacaoExclusaoTarefa(int id);
    void exibirNotificacaoEnvioTarefaAluno(int id);

    void carregarTarefasEmEdicao(ListaTarefasDal listaTarefasDal);
}
