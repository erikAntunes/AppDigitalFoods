package com.example.digitalhousefoods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.digitalhousefoods.entidades.Pratos;

public class PratoDetalheActivity extends AppCompatActivity {

    private ImageView fotoPrato;
    private TextView nomePrato;
    private TextView descricaoPrato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prato_detalhe);

        fotoPrato = findViewById(R.id.detalhe_prato_foto_img);
        nomePrato = findViewById(R.id.detalhe_prato_nome_txt);
        descricaoPrato = findViewById(R.id.detalhe_prato_descricao_txt);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        Pratos pratos = (Pratos) bundle.getSerializable("PRATOS");

        fotoPrato.setImageResource(pratos.getFotoPrato());
        nomePrato.setText(pratos.getNomePrato());
        descricaoPrato.setText(pratos.getDescricaoPrato());

    }
}
