package com.example.tarefasdiarias;

import com.example.tarefasdiarias.gestaologin.dtos.LoginDto;
import com.example.tarefasdiarias.gestaologin.fragments.AutorizacaoDal;

public interface LoginDal {
    void logar(AutorizacaoDal autorizacaoDal);
}
