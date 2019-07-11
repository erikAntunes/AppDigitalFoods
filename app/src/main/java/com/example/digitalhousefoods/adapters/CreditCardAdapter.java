package com.example.digitalhousefoods.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.digitalhousefoods.CreditCardsActivity;
import com.example.digitalhousefoods.R;
import com.example.digitalhousefoods.entidades.CreditCard;

import java.util.List;

public class CreditCardAdapter extends RecyclerView.Adapter<CreditCardAdapter.ViewHolderCreditCard> {

    private List<CreditCard> listaCreditCard;

    public CreditCardAdapter(List<CreditCard> listaCreditCard, CreditCardsActivity creditCardsActivity) {
        this.listaCreditCard = listaCreditCard;
    }

    @NonNull
    @Override
    public CreditCardAdapter.ViewHolderCreditCard onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.credit_card_celula, parent, false);

        ViewHolderCreditCard viewHolderCreditCard = new ViewHolderCreditCard(view);

        return viewHolderCreditCard;
    }

    @Override
    public void onBindViewHolder(@NonNull CreditCardAdapter.ViewHolderCreditCard holder, int position) {

        holder.nomeCreditCard.setText(listaCreditCard.get(position).getNome());
        holder.numeroCreditCard.setText(listaCreditCard.get(position).getNumero());


    }

    @Override
    public int getItemCount() {
        return listaCreditCard.size();
    }

    public class ViewHolderCreditCard extends RecyclerView.ViewHolder {

        public TextView nomeCreditCard;
        public TextView numeroCreditCard;

        public ViewHolderCreditCard(@NonNull View itemView) {
            super(itemView);

            nomeCreditCard = itemView.findViewById(R.id.credit_card_name_txt);
            numeroCreditCard = itemView.findViewById(R.id.credit_card_number_txt);
        }
    }
}
