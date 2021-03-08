package com.example.tarefasdiarias.gestaologin.fragments;

import com.example.tarefasdiarias.gestaologin.dtos.LoginDto;

public interface AutorizacaoDal {
    LoginDto obterLogin();

    void finalizarProgressoLogin();

    void iniciarProgressoLogin();
}
