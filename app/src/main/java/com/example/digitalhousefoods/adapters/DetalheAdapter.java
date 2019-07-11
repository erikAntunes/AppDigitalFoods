package com.example.digitalhousefoods.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.digitalhousefoods.R;
import com.example.digitalhousefoods.RestauranteDetalheActivity;
import com.example.digitalhousefoods.entidades.Pratos;
import com.example.digitalhousefoods.interfaces.PratosListener;

import java.util.ArrayList;
import java.util.List;

public class DetalheAdapter extends RecyclerView.Adapter<DetalheAdapter.ViewHolderDetalhe> {

    private List<Pratos> listaPratos;
    private PratosListener pratosListener;


    public DetalheAdapter(List<Pratos> listaPratos) {
        this.listaPratos = listaPratos;
    }

    public DetalheAdapter(List<Pratos> listaPratos, PratosListener pratosListener) {
        this.listaPratos = listaPratos;
        this.pratosListener = pratosListener;
    }

    @NonNull
    @Override
    public DetalheAdapter.ViewHolderDetalhe onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.pratos_celula, parent, false);

        ViewHolderDetalhe viewHolderDetalhe = new ViewHolderDetalhe(view);

        return viewHolderDetalhe;
    }

    @Override
    public void onBindViewHolder(@NonNull DetalheAdapter.ViewHolderDetalhe holder, final int position) {

        holder.nomePrato.setText(listaPratos.get(position).getNomePrato());
        holder.fotoPrato.setImageResource(listaPratos.get(position).getFotoPrato());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pratosListener.onPratoClicado(listaPratos.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listaPratos.size();
    }

    public class ViewHolderDetalhe extends RecyclerView.ViewHolder {

        public ImageView fotoPrato;
        public TextView nomePrato;

        public ViewHolderDetalhe(@NonNull View itemView) {
            super(itemView);

            fotoPrato = itemView.findViewById(R.id.detalhe_foto_prato);
            nomePrato = itemView.findViewById(R.id.detalhe_nome_prato_txt);
        }
    }
}
