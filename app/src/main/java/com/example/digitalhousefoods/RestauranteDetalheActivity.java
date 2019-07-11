package com.example.digitalhousefoods;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.digitalhousefoods.adapters.DetalheAdapter;
import com.example.digitalhousefoods.entidades.Pratos;
import com.example.digitalhousefoods.entidades.Restaurante;
import com.example.digitalhousefoods.interfaces.PratosListener;

import java.util.ArrayList;
import java.util.List;

public class RestauranteDetalheActivity extends AppCompatActivity implements PratosListener {

    private ImageView fotoRestaurante;
    private TextView nomeRestaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante_detalhe);

        fotoRestaurante = findViewById(R.id.detalhe_foto_restaurante);
        nomeRestaurante = findViewById(R.id.detalhe_nome_restaurante_txt);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        Restaurante restaurante = (Restaurante) bundle.getSerializable("RESTAURANTE");

        nomeRestaurante.setText(restaurante.getNameRestaurant());
        fotoRestaurante.setImageResource(restaurante.getImageRestaurant());

        List<Pratos> listaPratos1 = new ArrayList<>();
        Pratos prato1_1 = new Pratos();
        prato1_1.setNomePrato("Picanha Cheddar Bacon");
        prato1_1.setFotoPrato(R.drawable.restaurant1_prato1);
        prato1_1.setDescricaoPrato("Picanha Cheddar Bacon. Com muita picanha, muito cheddar, muito bacon. ");
        listaPratos1.add(prato1_1);

        Pratos prato2_1 = new Pratos();
        prato2_1.setNomePrato("2 clássicos por R$14,90");
        prato2_1.setFotoPrato(R.drawable.restaurant1_prato2);
        prato2_1.setDescricaoPrato("Os preferidos do McDonald’s para você combinar como quiser.");
        listaPratos1.add(prato2_1);

        Pratos prato3_1 = new Pratos();
        prato3_1.setNomePrato("Novo McFlurry e McShake Sonho de Valsa");
        prato3_1.setFotoPrato(R.drawable.restaurant1_prato3);
        prato3_1.setDescricaoPrato("Experimente e ame você também.");
        listaPratos1.add(prato3_1);
        listaPratos1.add(prato1_1);
        listaPratos1.add(prato2_1);
        listaPratos1.add(prato3_1);

        List<Pratos> listaPratos2 = new ArrayList<>();
        Pratos prato1_2 = new Pratos();
        prato1_2.setNomePrato("Wings, Ribs & Fries");
        prato1_2.setFotoPrato(R.drawable.restaurant2_prato1);
        prato1_2.setDescricaoPrato("Felicidade em dose tripla: são cinco Kookaburra Wings®, cinco costelas da nossa ribs e uma Joey Aussie Fries. Acompanhados de molhos Blue Cheese e Ranch. Escolha também um molho para sua ribs, entre Barbecue e Billabong.");
        listaPratos2.add(prato1_2);

        Pratos prato2_2 = new Pratos();
        prato2_2.setNomePrato("Ridgy Didgy Mini Burgers");
        prato2_2.setFotoPrato(R.drawable.restaurant2_prato2);
        prato2_2.setDescricaoPrato("Seis suculentos mini burgers com queijo especial, ketchup, mostarda, picles e cebola roxa. Tudo preparado e temperado no melhor estilo Outback. Servidos com fritas.");
        listaPratos2.add(prato2_2);

        Pratos prato3_2 = new Pratos();
        prato3_2.setNomePrato("Grilled Peppered Strip");
        prato3_2.setFotoPrato(R.drawable.restaurant2_prato3);
        prato3_2.setDescricaoPrato("São 240g do melhor steak grelhado de New York, preparado com tempero de pimentas pretas moídas e servido com molho Cabernet.");
        listaPratos2.add(prato3_2);
        listaPratos2.add(prato1_2);
        listaPratos2.add(prato2_2);
        listaPratos2.add(prato3_2);





        DetalheAdapter detalheAdapter = new DetalheAdapter(listaPratos2, this);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        RecyclerView recyclerView = findViewById(R.id.detalhe_recycler_view);
        recyclerView.setAdapter(detalheAdapter);
        recyclerView.setLayoutManager(layoutManager);



    }

    @Override
    public void onPratoClicado(Pratos pratos) {

        Intent intent = new Intent(this, PratoDetalheActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("PRATOS", pratos);

        intent.putExtras(bundle);

        startActivity(intent);
    }
}
