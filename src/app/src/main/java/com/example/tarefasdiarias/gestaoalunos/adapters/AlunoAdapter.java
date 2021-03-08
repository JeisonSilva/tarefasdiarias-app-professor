package com.example.tarefasdiarias.gestaoalunos.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tarefasdiarias.HomeDal;
import com.example.tarefasdiarias.R;
import com.example.tarefasdiarias.gestaodisciplinas.DisciplinaDto;
import com.example.tarefasdiarias.gestaotarefas.dtos.AlunoMatriculadoDto;

public class AlunoAdapter extends RecyclerView.Adapter<AlunoViewHolder> {

    private final AlunoMatriculadoDto[] alunoMatriculadoDtos;
    private final HomeDal homeDal;

    public AlunoAdapter(Context context, AlunoMatriculadoDto[] alunoMatriculadoDtos) {
        this.alunoMatriculadoDtos = alunoMatriculadoDtos;
        this.homeDal = (HomeDal)context;
    }

    @NonNull
    @Override
    public AlunoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista_card, parent, false);
        return new AlunoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AlunoViewHolder holder, int position) {
        String email = this.alunoMatriculadoDtos[position].getEmail();
        String nome = this.alunoMatriculadoDtos[position].getNome();

        holder.img_logo.setImageResource(R.mipmap.icon_aluno);
        holder.text_view_id.setText(String.format("Nome: %s", nome));
        holder.text_view_descricao.setText(String.format("Nome: %s", email));
    }

    @Override
    public int getItemCount() {
        return this.alunoMatriculadoDtos.length;
    }
}
