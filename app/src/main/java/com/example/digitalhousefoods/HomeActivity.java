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

        Pratos prato1_mcDonalds = new Pratos();
        prato1_mcDonalds.setNomePrato("Picanha Cheddar Bacon");
        prato1_mcDonalds.setFotoPrato(R.drawable.restaurant1_prato1);
        prato1_mcDonalds.setDescricaoPrato("Um delicioso hambúrguer feito com picanha, 4 fatias crocantes de bacon, nosso cremoso cheddar, cebola crispy e pão com gergelim. ");
        restaurante1.getListaDePratos().add(prato1_mcDonalds);

        Pratos prato2_mcDonalds = new Pratos();
        prato2_mcDonalds.setNomePrato("Big Mac");
        prato2_mcDonalds.setFotoPrato(R.drawable.restaurant1_prato2);
        prato2_mcDonalds.setDescricaoPrato("Não existe nada igual. Dois hambúrgueres, alface, queijo e molho especial, cebola e picles num pão com gergelim.");
        restaurante1.getListaDePratos().add(prato2_mcDonalds);

        Pratos prato3_mcDonalds = new Pratos();
        prato3_mcDonalds.setNomePrato("McLanche Feliz");
        prato3_mcDonalds.setFotoPrato(R.drawable.restaurant1_prato3);
        prato3_mcDonalds.setDescricaoPrato("As combinações mais deliciosas para criançada comer e se divertir. Mini Tasty com Tomatinhos, Água Mineral e Danoninho.");
        restaurante1.getListaDePratos().add(prato3_mcDonalds);

        Pratos prato4_mcDonalds = new Pratos();
        prato4_mcDonalds.setNomePrato("MC Fritas");
        prato4_mcDonalds.setDescricaoPrato("A batata frita mais famosa do mundo. Deliciosas batatas selecionadas, fritas, crocantes por fora, macias por dentro, douradas, irresistíveis, saborosas, famosas, e todos os outros adjetivos positivos que você quiser dar. ");
        prato4_mcDonalds.setFotoPrato(R.drawable.restaurant1_prato4);
        restaurante1.getListaDePratos().add(prato4_mcDonalds);
        restaurante1.getListaDePratos().add(prato1_mcDonalds);
        restaurante1.getListaDePratos().add(prato2_mcDonalds);
        restaurante1.getListaDePratos().add(prato3_mcDonalds);
        restaurante1.getListaDePratos().add(prato4_mcDonalds);

        listaRestaurante.add(restaurante1);

        Restaurante restaurante2 = new Restaurante();
        restaurante2.setImageRestaurant(R.drawable.restaurant2);
        restaurante2.setNameRestaurant("Outback Steakhouse");
        restaurante2.setAddressRestaurant("Av Interlagos, 2255, Shopping Interlagos - São Paulo");
        restaurante2.setCloseRestaurant("Fecha às 23:50");

        Pratos prato1_outBack = new Pratos();
        prato1_outBack.setNomePrato("Wings, Ribs & Fries");
        prato1_outBack.setFotoPrato(R.drawable.restaurant2_prato1);
        prato1_outBack.setDescricaoPrato("Felicidade em dose tripla: são cinco Kookaburra Wings®, cinco costelas da nossa ribs e uma Joey Aussie Fries. Acompanhados de molhos Blue Cheese e Ranch. Escolha também um molho para sua ribs, entre Barbecue e Billabong.");
        restaurante2.getListaDePratos().add(prato1_outBack);

        Pratos prato2_outBack = new Pratos();
        prato2_outBack.setNomePrato("Ridgy Didgy Mini Burgers");
        prato2_outBack.setFotoPrato(R.drawable.restaurant2_prato2);
        prato2_outBack.setDescricaoPrato("Seis suculentos mini burgers com queijo especial, ketchup, mostarda, picles e cebola roxa. Tudo preparado e temperado no melhor estilo Outback. Servidos com fritas.");
        restaurante2.getListaDePratos().add(prato2_outBack);

        Pratos prato3_outBack = new Pratos();
        prato3_outBack.setNomePrato("Grilled Peppered Strip");
        prato3_outBack.setFotoPrato(R.drawable.restaurant2_prato3);
        prato3_outBack.setDescricaoPrato("São 240g do melhor steak grelhado de New York, preparado com tempero de pimentas pretas moídas e servido com molho Cabernet.");
        restaurante2.getListaDePratos().add(prato3_outBack);

        Pratos prato4_outBack = new Pratos();
        prato4_outBack.setNomePrato("Chocolate Thunder From Down Under");
        prato4_outBack.setDescricaoPrato("Nosso brownie exclusivo e quentinho com sorvete de baunilha e deliciosa calda de chocolate preparada diariamente no Outback. Finalizado com chantilly e raspas de chocolate. *Contém nozes ou derivado de nozes.");
        prato4_outBack.setFotoPrato(R.drawable.restaurant2_prato4);
        restaurante2.getListaDePratos().add(prato4_outBack);
        restaurante2.getListaDePratos().add(prato1_outBack);
        restaurante2.getListaDePratos().add(prato2_outBack);
        restaurante2.getListaDePratos().add(prato3_outBack);
        restaurante2.getListaDePratos().add(prato4_outBack);

        listaRestaurante.add(restaurante2);

        Restaurante restaurante3 = new Restaurante();
        restaurante3.setImageRestaurant(R.drawable.restaurant3);
        restaurante3.setNameRestaurant("Domino's Pizza Brasil");
        restaurante3.setAddressRestaurant("Avenida Almirante Barroso, 81, Centro, Rio de Janeiro");
        restaurante3.setCloseRestaurant("Fecha às 22:00");


        Pratos prato1_dominoS = new Pratos();
        prato1_dominoS.setNomePrato("Calzone 4 Queijos");
        prato1_dominoS.setFotoPrato(R.drawable.restaurant3_prato1);
        prato1_dominoS.setDescricaoPrato("Mussarela, Parmesao, Requeijao, Gorgonzola, Oregano, Molho");
        restaurante3.getListaDePratos().add(prato1_dominoS);

        Pratos prato2_dominoS = new Pratos();
        prato2_dominoS.setNomePrato("Pizza Bauru");
        prato2_dominoS.setFotoPrato(R.drawable.restaurant3_prato2);
        prato2_dominoS.setDescricaoPrato("Mussarela, presunto, requeijão e tomate.");
        restaurante3.getListaDePratos().add(prato2_dominoS);

        Pratos prato3_dominoS = new Pratos();
        prato3_dominoS.setNomePrato("Frango Grelhado");
        prato3_dominoS.setFotoPrato(R.drawable.restaurant3_prato3);
        prato3_dominoS.setDescricaoPrato("Requeijão, frango, azeitona preta, mussarela, tomate, azeite e manjericão.");
        restaurante3.getListaDePratos().add(prato3_dominoS);

        Pratos prato4_dominoS = new Pratos();
        prato4_dominoS.setNomePrato("Pizza de Chocolate");
        prato4_dominoS.setDescricaoPrato("Brotinho de chocolate com granulado.");
        prato4_dominoS.setFotoPrato(R.drawable.restaurant3_prato4);
        restaurante3.getListaDePratos().add(prato4_dominoS);
        restaurante3.getListaDePratos().add(prato1_dominoS);
        restaurante3.getListaDePratos().add(prato2_dominoS);
        restaurante3.getListaDePratos().add(prato3_dominoS);
        restaurante3.getListaDePratos().add(prato4_dominoS);

        listaRestaurante.add(restaurante3);
        listaRestaurante.add(restaurante1);
        listaRestaurante.add(restaurante2);
        listaRestaurante.add(restaurante3);

        HomeAdapter homeAdapter = new HomeAdapter(listaRestaurante, this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
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
