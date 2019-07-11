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
        listaRestaurante.add(restaurante1);

        Restaurante restaurante2 = new Restaurante();
        restaurante2.setImageRestaurant(R.drawable.restaurant2);
        restaurante2.setNameRestaurant("Outback Steakhouse");
        restaurante2.setAddressRestaurant("Av Interlagos, 2255, Shopping Interlagos - São Paulo");
        restaurante2.setCloseRestaurant("Fecha às 23:50");
        listaRestaurante.add(restaurante2);

        Restaurante restaurante3 = new Restaurante();
        restaurante3.setImageRestaurant(R.drawable.restaurant3);
        restaurante3.setNameRestaurant("Domino's Pizza Brasil");
        restaurante3.setAddressRestaurant("Avenida Almirante Barroso, 81, Centro, Rio de Janeiro");
        restaurante3.setCloseRestaurant("Fecha às 22:00");
        listaRestaurante.add(restaurante3);

        listaRestaurante.add(restaurante1);
        listaRestaurante.add(restaurante2);
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
