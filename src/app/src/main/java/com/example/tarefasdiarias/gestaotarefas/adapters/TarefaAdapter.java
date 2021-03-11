package com.example.tarefasdiarias.gestaotarefas.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tarefasdiarias.R;
import com.example.tarefasdiarias.gestaotarefas.dtos.TarefaEmDigitacaoDto;
import com.example.tarefasdiarias.gestaotarefas.fragments.ListaTarefasEmDigitacaoDal;

public class TarefaAdapter extends RecyclerView.Adapter<TarefaViewHolder> {

    private final TarefaEmDigitacaoDto[] tarefasEmDigitacao;
    private final Context context;

    public TarefaAdapter(Context context, TarefaEmDigitacaoDto[] tarefasEmDigitacao) {
        this.tarefasEmDigitacao = tarefasEmDigitacao;
        this.context = context;
    }

    @NonNull
    @Override
    public TarefaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tarefa_card, parent, false);
        return new TarefaViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull TarefaViewHolder holder, final int position) {

        String titulo = String.format("%s",this.tarefasEmDigitacao[position].getTitulo());
        String aluno = String.format("Aluno: %s",this.tarefasEmDigitacao[position].getAluno());
        String professor = String.format("Professor: %s",this.tarefasEmDigitacao[position].getProfessor());
        String disciplina = String.format("Disciplina: %s",this.tarefasEmDigitacao[position].getDisciplina());
        String pontuacao = String.format("Pontuação: %s",this.tarefasEmDigitacao[position].getPontuacao());

        if(this.tarefasEmDigitacao[position].isTarefaEntregue()){
            holder.tv_status.setText("FINALIZADO");
            holder.bt_edicar.setVisibility(View.GONE);
            holder.bt_envio_aluno.setVisibility(View.GONE);
        }

        holder.tv_titulo.setText(titulo);
        holder.tv_aluno.setText(aluno);
        holder.tv_professor.setText(professor);
        holder.tv_disciplina.setText(disciplina);
        holder.tv_pontuacao.setText(pontuacao);

        holder.bt_edicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListaTarefasEmDigitacaoDal listaTarefasEmDigitacaoDal =(ListaTarefasEmDigitacaoDal) context;
                listaTarefasEmDigitacaoDal.exibirTelaParaEditarTarefa(tarefasEmDigitacao[position].getId());
            }
        });

        holder.bt_exclusao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListaTarefasEmDigitacaoDal listaTarefasEmDigitacaoDal =(ListaTarefasEmDigitacaoDal) context;
                listaTarefasEmDigitacaoDal.exibirNotificacaoExclusaoTarefa(tarefasEmDigitacao[position].getId());
            }
        });

        holder.bt_envio_aluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListaTarefasEmDigitacaoDal listaTarefasEmDigitacaoDal =(ListaTarefasEmDigitacaoDal) context;
                listaTarefasEmDigitacaoDal.exibirNotificacaoEnvioTarefaAluno(tarefasEmDigitacao[position].getId());
            }
        });

    }

    @Override
    public int getItemCount() {
        return this.tarefasEmDigitacao.length;
    }
}
