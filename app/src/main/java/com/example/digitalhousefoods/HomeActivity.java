package com.example.digitalhousefoods;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.digitalhousefoods.adapters.HomeAdapter;
import com.example.digitalhousefoods.entidades.Pratos;
import com.example.digitalhousefoods.entidades.Restaurante;
import com.example.digitalhousefoods.interfaces.RestaurantesListener;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements RestaurantesListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        List<Restaurante> listaRestaurante = new ArrayList<>();

        Restaurante restaurante1 = new Restaurante();
        restaurante1.setImageRestaurant(R.drawable.restaurant1);
        restaurante1.setNameRestaurant("McDonald's");
        restaurante1.setAddressRestaurant("Alameda Amazonas, 253, Alphaville - 06454-070 Barueri - São Paulo");
        restaurante1.setCloseRestaurant("24 horas");

        Pratos prato1_1 = new Pratos();
        prato1_1.setNomePrato("Picanha Cheddar Bacon");
        prato1_1.setFotoPrato(R.drawable.restaurant1_prato1);
        prato1_1.setDescricaoPrato("Picanha Cheddar Bacon. Com muita picanha, muito cheddar, muito bacon. ");
        restaurante1.getListaDePratos().add(prato1_1);

        Pratos prato2_1 = new Pratos();
        prato2_1.setNomePrato("2 clássicos por R$14,90");
        prato2_1.setFotoPrato(R.drawable.restaurant1_prato2);
        prato2_1.setDescricaoPrato("Os preferidos do McDonald’s para você combinar como quiser.");
        restaurante1.getListaDePratos().add(prato2_1);

        Pratos prato3_1 = new Pratos();
        prato3_1.setNomePrato("Novo McFlurry e McShake Sonho de Valsa");
        prato3_1.setFotoPrato(R.drawable.restaurant1_prato3);
        prato3_1.setDescricaoPrato("Experimente e ame você também.");
        restaurante1.getListaDePratos().add(prato3_1);

        listaRestaurante.add(restaurante1);

        Restaurante restaurante2 = new Restaurante();
        restaurante2.setImageRestaurant(R.drawable.restaurant2);
        restaurante2.setNameRestaurant("Outback Steakhouse");
        restaurante2.setAddressRestaurant("Av Interlagos, 2255, Shopping Interlagos - São Paulo");
        restaurante2.setCloseRestaurant("Fecha às 23:50");

        Pratos prato1_2 = new Pratos();
        prato1_2.setNomePrato("Wings, Ribs & Fries");
        prato1_2.setFotoPrato(R.drawable.restaurant2_prato1);
        prato1_2.setDescricaoPrato("Felicidade em dose tripla: são cinco Kookaburra Wings®, cinco costelas da nossa ribs e uma Joey Aussie Fries. Acompanhados de molhos Blue Cheese e Ranch. Escolha também um molho para sua ribs, entre Barbecue e Billabong.");
        restaurante2.getListaDePratos().add(prato1_2);

        Pratos prato2_2 = new Pratos();
        prato2_2.setNomePrato("Ridgy Didgy Mini Burgers");
        prato2_2.setFotoPrato(R.drawable.restaurant2_prato2);
        prato2_2.setDescricaoPrato("Seis suculentos mini burgers com queijo especial, ketchup, mostarda, picles e cebola roxa. Tudo preparado e temperado no melhor estilo Outback. Servidos com fritas.");
        restaurante2.getListaDePratos().add(prato2_2);

        Pratos prato3_2 = new Pratos();
        prato3_2.setNomePrato("Grilled Peppered Strip");
        prato3_2.setFotoPrato(R.drawable.restaurant2_prato3);
        prato3_2.setDescricaoPrato("São 240g do melhor steak grelhado de New York, preparado com tempero de pimentas pretas moídas e servido com molho Cabernet.");
        restaurante2.getListaDePratos().add(prato3_2);

        listaRestaurante.add(restaurante2);

        Restaurante restaurante3 = new Restaurante();
        restaurante3.setImageRestaurant(R.drawable.restaurant3);
        restaurante3.setNameRestaurant("Domino's Pizza Brasil");
        restaurante3.setAddressRestaurant("Avenida Almirante Barroso, 81, Centro, Rio de Janeiro");
        restaurante3.setCloseRestaurant("Fecha às 22:00");


        Pratos prato1_3 = new Pratos();
        prato1_3.setNomePrato("Calzone 4 Queijos");
        prato1_3.setFotoPrato(R.drawable.restaurant3_prato1);
        prato1_3.setDescricaoPrato("Mussarela, Parmesao, Requeijao, Gorgonzola, Oregano, Molho");
        restaurante3.getListaDePratos().add(prato1_3);

        Pratos prato2_3 = new Pratos();
        prato2_3.setNomePrato("Pizza Bauru");
        prato2_3.setFotoPrato(R.drawable.restaurant3_prato2);
        prato2_3.setDescricaoPrato("Mussarela, presunto, requeijão e tomate.");
        restaurante3.getListaDePratos().add(prato2_3);

        Pratos prato3_3 = new Pratos();
        prato3_3.setNomePrato("Frango Grelhado");
        prato3_3.setFotoPrato(R.drawable.restaurant3_prato3);
        prato3_3.setDescricaoPrato("Requeijão, frango, azeitona preta, mussarela, tomate, azeite e manjericão.");
        restaurante3.getListaDePratos().add(prato3_3);

        listaRestaurante.add(restaurante3);

        HomeAdapter homeAdapter = new HomeAdapter(listaRestaurante, this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView recyclerView = findViewById(R.id.home_recycler_view);
        recyclerView.setAdapter(homeAdapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public void onRestauranteClicado(Restaurante restaurante) {

        Intent intent = new Intent(this, RestauranteDetalheActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("RESTAURANTE", restaurante);

        intent.putExtras(bundle);

        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        MenuItem menuItem = menu.add(0, 0, 0, "Profile");
        menuItem.setShowAsAction(menuItem.SHOW_AS_ACTION_NEVER);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case 0: Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
            break;
        } return true;
    }
}
