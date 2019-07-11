package com.example.digitalhousefoods.adapters;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.digitalhousefoods.HomeActivity;
import com.example.digitalhousefoods.R;
import com.example.digitalhousefoods.entidades.Restaurante;
import com.example.digitalhousefoods.interfaces.RestaurantesListener;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolderHome> {

    private List<Restaurante> listaRestaurante;
    private RestaurantesListener restaurantesListener;

    public HomeAdapter (List<Restaurante> listaRestaurante){
        this.listaRestaurante = listaRestaurante;
    }

    public HomeAdapter(List<Restaurante> listaRestaurante, RestaurantesListener restaurantesListener) {
        this.listaRestaurante = listaRestaurante;
        this.restaurantesListener = restaurantesListener;
    }


    @NonNull
    @Override
    public HomeAdapter.ViewHolderHome onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.restaurantes_celula, parent, false);

        ViewHolderHome viewHolderHome = new ViewHolderHome(view);

        return viewHolderHome;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.ViewHolderHome holder, final int position) {

        holder.imageRestaurant.setImageResource(listaRestaurante.get(position).getImageRestaurant());
        holder.nameRestaurant.setText(listaRestaurante.get(position).getNameRestaurant());
        holder.addressRestaurant.setText(listaRestaurante.get(position).getAddressRestaurant());
        holder.closeRestaurant.setText(listaRestaurante.get(position).getCloseRestaurant());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restaurantesListener.onRestauranteClicado(listaRestaurante.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return listaRestaurante.size();
    }

    public class ViewHolderHome extends RecyclerView.ViewHolder {

        public ImageView imageRestaurant;
        public TextView nameRestaurant;
        public TextView addressRestaurant;
        public TextView closeRestaurant;

        public ViewHolderHome(@NonNull View itemView) {
            super(itemView);

            imageRestaurant = itemView.findViewById(R.id.restaurant_image_view);
            nameRestaurant = itemView.findViewById(R.id.restaurant_name_text_view);
            addressRestaurant = itemView.findViewById(R.id.restaurant_address_text_view);
            closeRestaurant = itemView.findViewById(R.id.restaurant_close_text_view);
        }
    }
}
